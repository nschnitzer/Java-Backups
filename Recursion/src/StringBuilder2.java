//*************************************************************************
// Nathan Schnitzer
// StringBuilder2.java
// 9/26/17
// This program will utilize tokenizer and remove unwanted sybols
//*************************************************************************

import java.util.StringTokenizer;

public class StringBuilder2 
{
	public StringTokenizer tokenizer;
	public String token = "";
	public String stringy;
	public String delims;
	
	//Construct with only the token
	public StringBuilder2(String str)
	{
		stringy = str;
	}
	
	//Construct with token and delimiter
	public StringBuilder2(String str, String dlim)
	{
		stringy = str;
		setDelims(dlim);
	}
	
	//Sets Delimiters
	public void setDelims(String dlim)
	{
		delims = dlim;
		tokenizer = new StringTokenizer(stringy, delims);
	}
	
	//Gets Delimeters
	public String getDelims()
	{
		return delims;
	}
	
	//Method override
	public String findAndReplace(String delims)
	{
		setDelims(delims);
		tokenizer = new StringTokenizer(stringy, getDelims());
		while (tokenizer.hasMoreTokens())
			token += tokenizer.nextToken();
		
		return token;
		
	}
	
	//Method override
	public String findAndReplace()
	{
		tokenizer = new StringTokenizer(stringy, getDelims());
		while (tokenizer.hasMoreTokens())
		token += tokenizer.nextToken();
		
		return token;
	}
	
	//ToString Method and returns a String
	public String toString()
	{
		return stringy + " ---> " + findAndReplace();
	}
	
	

}
