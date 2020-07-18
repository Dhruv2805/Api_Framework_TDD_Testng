package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Http_method 
{
	Properties p;
	public  Http_method(Properties pro)
	{
		this.p=pro;
	}
	
	public  Response posthitrequest(String body,String keyname)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(p.getProperty(keyname));
		
		return res;
		
	}
	
	public  Response Getthitrequest(String URIKey,String idvalue)		//TC2..6th we have created a Getrequest BDD approach 
	{
		
		String GetURIkey=p.getProperty(URIKey)+"/"+idvalue;			//TC2..7th..we have to fetch the Base(URIkey)+Endpoint(idvalue) to get the exact benedict 
																	//cumberbatch details data.
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(GetURIkey);
		
		return res;
	}												//Now will go to main Getrequest hit class
	
	public  Response GetthitrequestAllData(String URIKey)		//TC2..6th we have created a Getrequest BDD approach 
	{
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(p.getProperty(URIKey));
		
		return res;
	}		
	
	public Response  UpdateRequest(String Bodydata, String URIKey,String idvalue)		//TC4..1ST we have created a PUTrequest BDD approach 
	{
		
		String PutURIkey=p.getProperty(URIKey)+"/"+idvalue;			//TC4..2nd..we have to fetch the Base(URIkey)+Endpoint(idvalue) to update the exact benedict  detail for that particular id value
																	//cumberbatch details data.
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(Bodydata)
		.when()
		.put(PutURIkey);
		
		return res;							//TC4..3rd..now  we will create the TC4 main class to hit put request in teststeps 
	}
	public  Response DeleteRequest(String URIKey)		//TC2..6th we have created a Getrequest BDD approach 
	{
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(p.getProperty(URIKey));
		
		return res;
	}		
	
}

