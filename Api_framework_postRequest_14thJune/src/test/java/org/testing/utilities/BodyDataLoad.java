package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class BodyDataLoad 
{
	public static String jsonbodyload(String pathname) throws FileNotFoundException
	{
		File f=new File(pathname);
		FileReader fr=new FileReader(f);
		JSONTokener jst=new JSONTokener(fr);
		
		JSONObject jsobject=new JSONObject(jst);
		return jsobject.toString();
	}
}
