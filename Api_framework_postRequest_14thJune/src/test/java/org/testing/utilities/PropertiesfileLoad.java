package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileLoad 
{
	public static Properties PropertiesLoad(String pathname) throws IOException
	{
		File f=new File(pathname);
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		
		return pr;
	}
}
