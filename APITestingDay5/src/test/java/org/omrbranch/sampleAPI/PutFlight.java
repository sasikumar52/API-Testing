package org.omrbranch.sampleAPI;

import org.omrbranch.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PutFlight extends BaseClass {
	
	@Test
	public void put()
	{
		//1.Header
				addHeader("Content-Type", "application/json");
				//2.Body
				addReqBody("{\r\n"
						+ "    \"flightName\": \"INDIGO\",\r\n"
						+ "    \"Country\": \"US\",\r\n"
						+ "    \"Destinations\": 68,\r\n"
						+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
						+ "}");
				//3.Add req
				Response response = addRequest("PUT", "https://omrbranch.com/api/flight/36733");
				//4.get status code
				int statusCode = getStatusCode(response);
				System.out.println(statusCode);
				String resBodyAsPrettyString = getResBodyAsPrettyString(response);
				System.out.println(resBodyAsPrettyString);
		
	}

}
