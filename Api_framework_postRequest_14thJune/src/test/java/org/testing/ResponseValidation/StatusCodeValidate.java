package org.testing.ResponseValidation;

import org.apache.http.util.Asserts;
import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class StatusCodeValidate 
{
	public static void statusvalidate(int expectedCode,Response res)
	{
		
		Assert.assertEquals(res.statusCode(), expectedCode,"Status code not matching");
		
	}
}
