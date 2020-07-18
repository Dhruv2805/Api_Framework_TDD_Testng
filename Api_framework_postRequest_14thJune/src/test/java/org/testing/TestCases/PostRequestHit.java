package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.BodydataValidate;
import org.testing.ResponseValidation.StatusCodeValidate;
import org.testing.TestSteps.Http_method;
import org.testing.utilities.BodyDataLoad;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesfileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class PostRequestHit 
{
	static String idvalue;
	static String bodyData;
	@Test
	public static void TC1() throws IOException 		//TC2..2nd we changesd the post reqst main method to normal TC1 method
	{
		System.out.println("************TC1************** ");
		Properties p=PropertiesfileLoad.PropertiesLoad("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/Keyname.properties");
		String jsonbody=BodyDataLoad.jsonbodyload("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/BodyData.json");
		System.out.println("body data before replacement " +jsonbody.toString());
		
		Random r=new Random();
		Integer random_nub=r.nextInt();
		
		String JsonDataAfterReplacement=JsonVariableReplacement.jsonvariablereplace(jsonbody, "id", random_nub.toString());
		System.out.println("body data after replacement " +JsonDataAfterReplacement.toString());
		
		Http_method http=new Http_method(p);
		Response res=http.posthitrequest(JsonDataAfterReplacement, "friendrequest");
		System.out.println("status code  after post requst is "+res.statusCode());
		
		StatusCodeValidate.statusvalidate(201, res);
		System.out.println("body data after post requst is "+res.asString());
		
		BodydataValidate.jsondataValidate("benedict", res, "firstname");
		
		
		idvalue=res.jsonPath().get("id"); //TC2..1st we will fetch the id value from the  post request  and store into new variable for further GET request
		System.out.println(" id value after post request used for Get request hit " +idvalue);
		
		bodyData=JsonDataAfterReplacement;
		
	}
}
