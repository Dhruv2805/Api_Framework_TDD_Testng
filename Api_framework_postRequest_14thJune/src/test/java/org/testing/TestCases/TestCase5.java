package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.Http_method;
import org.testing.utilities.PropertiesfileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TestCase5 
{
	@Test
	public static void TC5() throws IOException 
	{
		/***********TC5*************/
		System.out.println("************TC5************** ");
		Properties p=PropertiesfileLoad.PropertiesLoad("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/Keyname.properties");
		
		Http_method http=new Http_method(p);
		Response res=http.DeleteRequest("sendmessage");
		System.out.println("Status code for the TC5 is: "+res.statusCode());
	}
}
