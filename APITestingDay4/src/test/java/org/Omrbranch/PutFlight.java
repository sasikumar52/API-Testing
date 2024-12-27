package org.Omrbranch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutFlight {

	public static void main(String[] args) {
		RequestSpecification reqSpe;

		// 1. Initialize the Rest Assured Class
		reqSpe = RestAssured.given();

		// 2. Req Body or Payload , Header, Authentication
		reqSpe = reqSpe.header("Content-Type", "application/json");
		reqSpe.body("{\r\n"
				+ "    \"flightName\": \"Indigo\",\r\n"
				+ "    \"Country\": \"Us\",\r\n"
				+ "    \"Destinations\": 11,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");

		// 3. Req type (GET,POST) , Endpoint
		Response response = reqSpe.put("https://omrbranch.com/api/flight/36316");

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
