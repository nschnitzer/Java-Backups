//*******************************************************************************
// Nathan Schnitzer
// Pdrome.java
// 9/25/17
// This will determine if a object is a palindrome
//*******************************************************************************
public class Pdrome 
{
	
	//Constructs a Pdrome method
	public Pdrome ()
	{
	}
	
	String stringyy;
	
	//Determines whether the String is a palindrome
	public static boolean palindrome(String stringy)
	{
		stringy = stringy.toLowerCase();
		StringBuilder1 builder = new StringBuilder1(stringy);
		stringy = builder.findRemove();
		
		int limit = stringy.length()-1;
		
		for (int i = 0; i <= limit; i++)
		{
			if (stringy.charAt(i) != stringy.charAt(limit))
			{
				return false;
			}
			limit--;
		}
		return true;
	}
	
	//Deterimes if string is palindrome using recursion
	public static boolean palindromeRec(String stringyy, int x, int y)
	{
		stringyy = stringyy.toLowerCase();
		StringBuilder1 builder = new StringBuilder1(stringyy);
		stringyy = builder.findRemove();
		
		if (stringyy.charAt(x) != stringyy.charAt(y))
			return false;
		else
			if(x <= y)
			return palindromeRec(stringyy, ++x, --y);
			else
				return true;
	}
	
	/* public static boolean palindromePlus(String stringy)
	{
		//Remove punctuation
		StringBuilder1 strbld = new StringBuilder1(stringy);
		stringy = strbld.findRemove();
		
		//make all lowercase
		stringy.toLowerCase();
		
		return Pdrome.palindrome(stringy);
	} */
	
	

}
