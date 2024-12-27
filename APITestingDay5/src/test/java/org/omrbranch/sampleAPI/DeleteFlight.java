package org.omrbranch.sampleAPI;

import org.omrbranch.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeleteFlight extends BaseClass {
	@Test
	public void delete()
	{
		addHeader("Content-Type", "application/json");
		Response response = addRequest("DELETE", "https://omrbranch.com/api/flight/36733");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		
	}

}
