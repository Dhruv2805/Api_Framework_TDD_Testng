package org.testing.utilities;



import org.json.JSONArray;




public class ParsingJsonUsingOrgJson 
{
	public static void extractjsonTC3(String ResponseData,String searchvalue) 			//it is like we have run the select query in SQL.
	{
		
		
		JSONArray jarray=new JSONArray(ResponseData);

		int l=jarray.length();
		System.out.println("body data lenght is "+l);
		
		for(int i=0;i<l;i++)
		{
			
			String all_extracted_data=jarray.getJSONObject(i).getString(searchvalue);	//search value means..when we give key name then automatically it will fetch all the key name respected value
			System.out.println("all extracted  data are : "+all_extracted_data);
				
		}
	}
}
