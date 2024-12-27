package org.Omrbranch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Rest Assured

public class GetSingleFlight {
	public static void main(String[] args) {
		RequestSpecification reqSpe;

		// 1. Initialize the Rest Assured Class
		reqSpe = RestAssured.given();

		// 2. Req Body or Payload , Header, Authentication
		reqSpe = reqSpe.header("Content-Type", "application/json");

		// 3. Req type (GET,POST) , Endpoint
		Response response = reqSpe.get("https://omrbranch.com/api/flight/35604");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String asString = response.asString();
		System.out.println(asString);

		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}

}
