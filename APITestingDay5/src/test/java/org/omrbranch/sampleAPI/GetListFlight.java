package org.omrbranch.sampleAPI;

import org.omrbranch.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetListFlight extends BaseClass {

	@Test
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
