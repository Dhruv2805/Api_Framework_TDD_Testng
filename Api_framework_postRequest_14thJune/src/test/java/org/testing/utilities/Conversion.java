package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion 
{
	public static String XmlConversionToJson(String xmlData)
	{
		JSONObject jsdata=XML.toJSONObject(xmlData);
		return jsdata.toString();
	}
	
	public static String JsonConversionToXml(String jsonBodyData)
	{
		JSONObject jso=new JSONObject(jsonBodyData);
		String xmldata=XML.toString(jso);
		
		return xmldata;
	}
}
