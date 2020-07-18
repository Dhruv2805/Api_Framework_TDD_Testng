package org.testing.TestCases;

import org.testing.utilities.Conversion;
import org.testng.annotations.Test;

public class TestCase8 
{
	@Test
	public static void TC8()
	{
		System.out.println("************TC8************** ");
		String xml_data_created="<firstname>Dhruv</firstname>";		//xml data creation
		
		
		/************XML to JSON Conversion************/
		String json_data=Conversion.XmlConversionToJson(xml_data_created);
		System.out.println("after Xml Conversion To Json " +json_data);
		
		/************JSON to XML Conversion************/
		String xml_data=Conversion.JsonConversionToXml(json_data);
		System.out.println("after json Conversion To XML " +xml_data);
		
	}
}
