package org.Omrbranch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteFlight {
	public static void main(String[] args) {



		RequestSpecification reqSpe;

		// 1. Initialize the Rest Assured Class
		reqSpe = RestAssured.given();

		// 2. Req Body or Payload , Header, Authentication
		reqSpe = reqSpe.header("Content-Type", "application/json");
		

		// 3. Req type (GET,POST,PUT,PATCH,DELETE) , Endpoint
		Response response = reqSpe.delete("https://omrbranch.com/api/flight/36316");

		//4. Status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		//5.Response
		String asString = response.asString();
		System.out.println(asString);

		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	
		
	
	}

}
