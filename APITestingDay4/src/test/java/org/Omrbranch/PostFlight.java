package org.Omrbranch;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostFlight {
	public static void main(String[] args) {
		RequestSpecification reqSpe;

		// 1. Initialize the Rest Assured Class
		reqSpe = RestAssured.given();

		// 2. Req Body or Payload , Header, Authentication
		reqSpe = reqSpe.header("Content-Type", "application/json");
		reqSpe.body("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");
		

		// 3. Req type (GET,POST) , Endpoint
		Response response = reqSpe.post("https://omrbranch.com/api/flights");
	
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
