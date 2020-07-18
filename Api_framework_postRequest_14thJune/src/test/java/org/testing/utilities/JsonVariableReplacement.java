package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement 
{
	public static String jsonvariablereplace(String jsbody,String variablename,String insertedvalue)
	{
		String JsonVarAfterReplacement=jsbody.replaceAll(Pattern.quote("{{"+variablename+"}}"), insertedvalue);
		
		return JsonVarAfterReplacement;
	}
}
