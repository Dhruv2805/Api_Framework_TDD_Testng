package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidate;
import org.testing.TestSteps.Http_method;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.PropertiesfileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestAllData 
{
	@Test
	public static void TC3() throws IOException				//here 1st we will remove the id parameter from http method-->get request and then remove base+endpoint URI (will keep it simple-for fetching all data after rquest)								
	{
		System.out.println("************TC3************** ");
		Properties p=PropertiesfileLoad.PropertiesLoad("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/Keyname.properties"); //TC2..4th load the properties file 
		
		//now will hit the Http method
		
		Http_method http=new Http_method(p);
		Response res=http.GetthitrequestAllData("friendrequest");
		System.out.println("Body data after Get request is "+res.asString());
		
		/************status validate************/
		StatusCodeValidate.statusvalidate(200, res);
		System.out.println("status code after get request for all data is "+res.statusCode());
		
		/*****************extract all ID value***************/
		ParsingJsonUsingOrgJson.extractjsonTC3(res.asString(),"id");
	//	ParsingJsonUsingOrgJson.extractjson(res.asString(),"firstname");
	}
}
