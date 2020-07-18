package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDataUpdateUsingOrgJson
{
	public static String jsondataUpdate(String BodyData,String searchKey,String ReplaceValue)		//2nd..TC6..update method created with generic style and step by step reach to the desired search key
	{
		JSONObject jsobj=new JSONObject(BodyData);
		JSONArray jsarray=jsobj.getJSONArray("phoneNumbers");
		int l=jsarray.length();
		
		for(int i=0;i<l;i++)
		{
			JSONObject jobj=jsarray.getJSONObject(i);
			jobj.put(searchKey, ReplaceValue);		//put method used for insert as well as for update also..but in TC6 it has updated(put method) the existing key value after found..but in TC7 it has inserted(put method)  a new key with new value because that catogory key doesn't exiits
			
		}
		return jsobj.toString();
	}
}
