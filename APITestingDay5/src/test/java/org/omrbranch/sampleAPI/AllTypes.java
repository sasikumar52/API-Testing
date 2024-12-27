package org.omrbranch.sampleAPI;

import org.omrbranch.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AllTypes extends BaseClass{
	
	Object id;
	@Test(priority = 1)
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
		JsonPath path = response.jsonPath();
	    id = path.get("data.id");
		System.out.println(id);
		
		
		
	}
	
	@Test(priority = 2)
	public void getSingle()
	{
		addHeader("Content-Type", "application/json");
		Response response = addRequest("GET", "https://omrbranch.com/api/flight/"+id+"");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);
	}
	
	@Test(priority = 3)
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
				Response response = addRequest("PUT", "https://omrbranch.com/api/flight/"+id+"");
				//4.get status code
				int statusCode = getStatusCode(response);
				System.out.println(statusCode);
				String resBodyAsPrettyString = getResBodyAsPrettyString(response);
				System.out.println(resBodyAsPrettyString);
		
	}
	
	@Test(priority = 4)
	public void patch() {

		// 1.Header
		addHeader("Content-Type", "application/json");
		// 2.Body
		addReqBody("{\r\n" + "    \"Destinations\": 100\r\n" + "}");
		// 3.Add req
		Response response = addRequest("PATCH", "https://omrbranch.com/api/flight/"+id+"");
		// 4.get status code
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);

	}
	@Test(priority = 5)
	public void delete()
	{
		addHeader("Content-Type", "application/json");
		Response response = addRequest("DELETE", "https://omrbranch.com/api/flight/36733");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		
	}

	@Test(priority = 6)
	public void getList()
	{
		addHeader("Content-Type", "application/json");
		Response response = addRequest("GET", "https://omrbranch.com/api/flights?page=1");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);
	}

	
	

}
