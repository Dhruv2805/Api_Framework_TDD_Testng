package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidate;
import org.testing.TestSteps.Http_method;
import org.testing.utilities.PropertiesfileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestHit 
{
	@Test
	public static void TC2() throws IOException			//TC2...3rd we will make a new Get reqst class and TC2 method
	{
		System.out.println("************TC2************** ");
		
		Properties p=PropertiesfileLoad.PropertiesLoad("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/Keyname.properties"); //TC2..4th load the properties file 
		String idValueforGet=PostRequestHit.idvalue;	//TC2..5th we will bring our id value form post request class to get rqst and will go to Http method
		
		//now till here we have fetch the id value ...and ..make a getrequest BDD approach to hit the URI(base+endpoint)..
		//now will hit the Http method
		
		Http_method http=new Http_method(p);
		Response res=http.Getthitrequest("friendrequest", idValueforGet);
		System.out.println("Body data after Get request is "+res.asString());
		
		//now response status validation we can perform
		
		StatusCodeValidate.statusvalidate(200, res);
		System.out.println("Status code after get request is "+res.statusCode());
		
		//now we have to hit the both the post+GET request for that we are Creating  Trigger class in new package.
		//one problem ...change the idvalue .. int to string bcoz it throws an exception on compilation "java.lang.String cannot be cast to java.lang.Integer" 
		
	}
}
