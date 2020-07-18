package org.testing.TestCases;
//TC6..we don't have to hit any http  method ..only we have to load the json file and then update the json file existing key value with the help of ORG.JSON library
import java.io.FileNotFoundException;


import org.testing.utilities.BodyDataLoad;
import org.testing.utilities.JsonDataUpdateUsingOrgJson;
import org.testng.annotations.Test;

public class TestCase6 
{
	public static String data;
	@Test
	public static void TC6() throws FileNotFoundException
	{
		System.out.println("************TC6************** ");
		
		String jsondata=BodyDataLoad.jsonbodyload("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/JsondataLoad_21june.json");	//1ST we have load the file ..then we have to make a method in utility to update using org.json
		System.out.println("before replacement of json file data"+jsondata);
		
		 jsondata=JsonDataUpdateUsingOrgJson.jsondataUpdate(jsondata, "type", "Samsung");		
		jsondata=JsonDataUpdateUsingOrgJson.jsondataUpdate(jsondata, "number", "68881212");

		System.out.println("After replacement of json file data"+jsondata);
		data=jsondata;
	}
	
}
