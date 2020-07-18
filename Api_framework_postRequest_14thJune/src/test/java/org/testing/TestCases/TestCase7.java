package org.testing.TestCases;
//TC7..we don't have to hit any http  method ..only we have to load the json file and then update the json file non existing key value with the help of ORG.JSON library

import java.io.FileNotFoundException;

import org.testing.utilities.BodyDataLoad;
import org.testing.utilities.JsonDataUpdateUsingOrgJson;
import org.testng.annotations.Test;

public class TestCase7 
{
	@Test
	public static void TC7() throws FileNotFoundException
	{
		System.out.println("************TC7************** ");
		String jsondata=BodyDataLoad.jsonbodyload("../Api_framework_postRequest_14thJune/src/test/java/org/testing/resources/JsondataLoad_21june.json");	//1ST we have load the file ..then we have to make a method in utility to update using org.json
	//	TestCase6 ts6=new TestCase6();																				// here just more try..i used the TC6 updated data and then executed TC7 on it..sc_shot https://prnt.sc/t5u0vo
		
		System.out.println("before new data insert of json file data"+jsondata);
		
		jsondata=JsonDataUpdateUsingOrgJson.jsondataUpdate(jsondata, "Category", "Cellphone");		
		
		System.out.println("After new data insert of json file data"+jsondata);
	}
}
