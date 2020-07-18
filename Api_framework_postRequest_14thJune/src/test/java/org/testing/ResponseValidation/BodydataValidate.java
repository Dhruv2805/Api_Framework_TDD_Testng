package org.testing.ResponseValidation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class BodydataValidate 
{
	public static void jsondataValidate(String ExpectedData,Response res,String jsonpath)
	{
		String ActualData=res.jsonPath().get(jsonpath);
		Assert.assertEquals(ActualData, ExpectedData,"data is not matching");
	}
}
