package org.omrbranch.sampleAPI;

import org.omrbranch.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

//Create Flight
public class CreateFlight extends BaseClass {

	@Test
	public void create() {
		// 1.Header
		addHeader("Content-Type", "application/json");
		// 2.Body
		addReqBody("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
		// 3.Add req
		Response response = addRequest("POST", "https://omrbranch.com/api/flights");
		
		
		// 4.get status code
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);
	}

}
