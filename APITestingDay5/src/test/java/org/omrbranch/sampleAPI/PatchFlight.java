package org.omrbranch.sampleAPI;

import org.omrbranch.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PatchFlight extends BaseClass{
	
	@Test
	public void patch() {

		// 1.Header
		addHeader("Content-Type", "application/json");
		// 2.Body
		addReqBody("{\r\n" + "    \"Destinations\": 100\r\n" + "}");
		// 3.Add req
		Response response = addRequest("PATCH", "https://omrbranch.com/api/flight/36733");
		// 4.get status code
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);

	}

}
