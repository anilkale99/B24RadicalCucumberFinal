package com.UpdateMessageValidationSD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.json.JSONObject;
import org.junit.Assert;

import com.google.gson.JsonObject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UpdateMessageValidation {
	Response response = null;
	@Given("update the data to create user")
	public void update_the_data_to_create_user() {
		response = RestAssured
				.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body("{\r\n"
						+ "    \"name\": \"user222\",\r\n"
						+ "    \"job\": \"QA leader\",\r\n"
						+ "    \"mob\": \"122\",\r\n"
						+ "    \"dept\": \"QA-Automation\",\r\n"
						+ "    \"location\": \"Pune\"\r\n"
						+ "}\r\n"
						+ "")
				.put("https://reqres.in/api/users");
	}
	@Then("validate status code is {string}")
	public void validate_status_code_is(String statuscode) {
		Assert.assertEquals(statuscode,""+ response.getStatusCode()+"");
	}
	@Then("validate id created for user with non null value")
	public void validate_id_created_for_user_with_non_null_value() {
	    //response.then().assertThat().body("id", notNullValue())
		System.out.println("validate id is not null");
	    String id = response.body().jsonPath().getString("id");
	    Assert.assertTrue(!id.equals(null) );
	}
	@Then("validate id created for user with non zero value")
	public void validate_id_created_for_user_with_non_zero_value() {
		int id = response.body().jsonPath().getInt("id");
	    Assert.assertTrue(id > 0 );
	}
	
	
	@Given("update the data to create user from file")
	public void post_the_data_to_create_user_from_file() {
		File file = new File("src/test/java/com/PostMessageValidationSD/CreateUser.json");
		response = RestAssured
				.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body(file)
				.put("https://reqres.in/api/users");
	}
	
	
	@Given("update the data to create user from file with updated name")
	public void update_the_data_to_create_user_from_file_with_updated_name(DataTable table) throws IOException {
		String dataString = new String(Files.readAllBytes(Paths.get("src/test/java/com/PostMessageValidationSD/CreateUser.json")));
		JSONObject jsonObject = new JSONObject(dataString);
		double randomNum = Math.random();
		jsonObject.put("name", "userNewName"+randomNum);
		String finalDataString = jsonObject.toString();
		response = RestAssured
				.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body(finalDataString)
				.put("https://reqres.in/api/users");
		response.then().log().all();
	}
	
	
	@Given("update the data to create user from file with updated fields")
	public void update_the_data_to_create_user_from_file_with_updated_field(DataTable table) throws IOException {
		String dataString = new String(Files.readAllBytes(Paths.get("src/test/java/com/PostMessageValidationSD/CreateUser.json")));
		JSONObject jsonObject = new JSONObject(dataString);
		double randomNum = Math.random();
		List<List<String >> allDataList =  table.asLists();
		for (int i = 0; i < allDataList.size();i++) {
			
			String field =  allDataList.get(i).get(0);
			
			if(field.equals("name")) {
				jsonObject.put("name", "userNewName"+randomNum);
			}else if(field.equals("mob")) {
				jsonObject.put("mob", "dsfads"+randomNum);
			}
		}
		
		String finalDataString = jsonObject.toString();
		response = RestAssured
				.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body(finalDataString)
				.put("https://reqres.in/api/users");
		response.then().log().all();
	}



}
