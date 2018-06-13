//************************************************************
// Nathan Schnitzer
// StringBuilder3.java
// 9/26/17
// This will utilize regular expression
//************************************************************

import java.util.Scanner;

public class StringBuilder3 
{
	public String stringy;
	public String pattern;
	int stringyLength, patternLength;
	
	//Constructs a StringBuilder3 object
	public StringBuilder3()
	{
	}
	
	//Uses regular expression to remove non delimeter characters
	public static String regularExpression(String str)
	{
		Scanner scan = new Scanner(str);
		String stringy = "";
		scan.useDelimiter("[\\\\\\\"\\\'!@#\\$%\\^&\\*\\(\\)\\,\\./;\\[\\]<>\\?:\\{\\}\\|\\-=_\\+`~]");
		
		while (scan.hasNext()) //Continues while scan has a token
		{
			stringy = stringy + scan.next();
		}
		
		scan.close();
		
		return stringy;
	}
	

}
