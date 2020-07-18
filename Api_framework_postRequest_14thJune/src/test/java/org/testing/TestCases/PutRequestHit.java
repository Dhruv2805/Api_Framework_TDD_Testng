package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.StatusCodeValidate;
import org.testing.TestSteps.Http_method;
import org.testing.utilities.PropertiesfileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PutRequestHit
{
	@Test
	public static void TC4() throws IOException 
	{
		System.out.println("************TC4************** ");
		//properties pr+ body data+ id value
		/********we have to bring property file  also *******/
		Properties p=PropertiesfileLoad.PropertiesLoad("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/Keyname.properties");
				
		/********we have to bring id also *******/
		String fetchedIdValue=PostRequestHit.idvalue;
		
		/********we have to create  body data using Org.json method  *******/
		
		JSONObject js=new JSONObject();
		js.put("firstname", "Tony");
		js.put("lastname", "Stark");
		js.put("marvel", "Ironman");
		js.put("id", fetchedIdValue);
		//now till here we have fetch the id value ...and ..now we will make a putrequest BDD approach to hit the URI(base+endpoint)..
		//now will hit the Http method
		
		Http_method http=new Http_method(p);
		Response res1=http.UpdateRequest(js.toString(), "friendrequest", fetchedIdValue);
		System.out.println("Body data after put request is "+res1.asString());
		
		//now response status validation we can perform
		
		StatusCodeValidate.statusvalidate(200, res1);
		System.out.println("Status code after get request is "+res1.statusCode());
		
		//now we have to hit the both the post+PUT request for that we are Creating  Trigger class in new package.
		//one problem ...change the idvalue .. int to string bcoz it throws an exception on compilation "java.lang.String cannot be cast to java.lang.Integer" 
		
	}
}
