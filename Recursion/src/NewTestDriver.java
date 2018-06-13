//***********************************************************
// Nathan Schnitzer
// NewTestDriver.java
// 10/12/17
// This driver will test multiple classes and methods
//***********************************************************

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;


public class NewTestDriver 
{
	
	
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		//Print out the array
		System.out.println("****************************************************************");
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		//Reverse the array
		System.out.println("Reversed:");
		System.out.println(Arrays.toString(Reverse.reverseArray(a, 0, a.length-1)));
		System.out.println();
		System.out.println("*********************************");
		System.out.println();
		
		//Sort the array using selection sort
		System.out.println("Sorting Reversed Array...");
		System.out.println(Arrays.toString(BinarySearcher.selectionSort(a)));
		System.out.println("****************************************************************");
		
		//Use Binary search to search for 20
		System.out.println();
		System.out.println("Searching array for '20'...");
		System.out.println("Found at index " + BinarySearcher.binarySearch(a, 20, 0, a.length-1));
		System.out.println("**********************************");
		System.out.println();
		
		//Use Binary Search to search for 35
		System.out.println("Searching array for 35...");
		System.out.println("Found at index " + BinarySearcher.binarySearch(a, 35, 0, a.length-1));
		System.out.println();
		System.out.println("*****************************************************************");
		System.out.println();
		
		//Find the factorial of 8 without tail recursion
		System.out.println("8! without tail recursion: " + Multiply.factorial(8));
		System.out.println("**********************************");
		System.out.println();
		System.out.println("8! with tail recursion: " + Multiply.factTailRec(8));
		System.out.println("*****************************************************************");
		System.out.println();
		
		//Determine if string is a palindrome
		String s1 = "racecar";
		String s2 = "computer";
		//Using recursion
		System.out.println("Using Recursion:");
		System.out.println("Is " + s1 + " a palindrome... " + Boolean.toString(Pdrome.palindromeRec(s1, 0, s1.length() - 1)));
		System.out.println("Is " + s2 + " a palindrome... " +  Boolean.toString(Pdrome.palindromeRec(s2, 0, s2.length()-1)));
		System.out.println("**********************************");
		
		//Without Recursion
		System.out.println("Without Recursion:");
		System.out.println("Is " + s1 + " a palindrome... " + Boolean.toString(Pdrome.palindrome(s1)));
		System.out.println("Is " + s2 + " a palindrome... " + Boolean.toString(Pdrome.palindrome(s2)));
		System.out.println("***********************************");
		System.out.println();
		
		//Create StringBuilder1,2,3 objects
		System.out.println("*****************************************************************");
		System.out.println();
		
		System.out.println("String Builder Classes:");
		
		System.out.println();
		String s3 = "I, have not: yet ! begin to / fight'";
		System.out.println("Original String: " + s3);
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println();
		
		StringBuilder1 build1 = new StringBuilder1(s3); //Create SB1 object
		System.out.println("Using String Builder1... " + build1.findRemove());
		System.out.println();
		System.out.println("***********************************");
		StringBuilder2 build2 = new StringBuilder2(s3, ",:!/'"); //Create SB2 object
		System.out.println();
		System.out.println("Using String Builder2... " + build2.findAndReplace());
		System.out.println();
		System.out.println("***********************************");
		System.out.println();
		System.out.println("Using String Builder3... " + StringBuilder3.regularExpression(s3));
		System.out.println();
		System.out.println("**************************************************************");
		
		
	}
	//**************************************************
	// Nathan Schnitzer
	// Add.java
	// 9/7/17
	// This will add sum of first n integers
	//**************************************************

	public static class Add 
	{
		public static int sum(int n)
		{
			if (n == 1)
			{
				return 1;
			}
			else
			{
				return n + sum(n-1);
			}
		}
		//***********************************************************
		// Nathan Schnitzer
		// Multiply.java
		// 9/7/17
		// This will emulate a factorial
		//***********************************************************

		public static class Multiply 
		{
			public static int factorial(int n)
			{
				if (n == 1)
				{
					return 1;
				}
				else
				{
					return n * factorial(n-1);
				}
			}
			
			public static int factTailRec(int n)
			{
				if (n == 0)
					return 1;
				else
					return factorial_i(n, 1);
			}
			
			//Uses tail recursion
			public static int factorial_i(int current, int sum)
			{
				if (current == 1)
					return sum;
				else
					return factorial_i(current - 1, sum * current);
			}

		}
	}
	
	//*******************************************************************************
	// Nathan Schnitzer
	// Pdrome.java
	// 9/25/17
	// This will determine if a object is a palindrome
	//*******************************************************************************
	public static class Pdrome 
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
		
	}

	//******************************************************************
	// Nathan Schnitzer
	// Reverse.java
	// 9/25/17
	// This will reverse an array
	//******************************************************************


	public static class Reverse 
	{
		public static int[] array0;
		
		//Constructs a Reverse object
		public Reverse()
		{
			
		}
		
		//Reverses an array
		public static int[] reverseArray(int[] array)
		{
			array0 = new int[array.length];
			int limit = array.length;
			int position = limit-1;
			int[] reversed = new int[limit];
			
			for (int i = 0; i < limit; i++)
			{
				reversed[position] = array[i];
				position--;
			}
			
			array0 = reversed;
			
			return reversed;
		}
		
		//Reverses an array recursively
		public static int[] reverseArray(int[] array, int i, int j)
		{
			array0 = new int[array.length];
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			while (i < j)
			{
				reverseArray(array, ++i, --j);
			}
			array0 = array;
			
			return array;
		}
		
		//Returns array0
		public int[] getArray()
		{
			return array0;
		}


	//*************************************************************
	// Nathan Schnitzer
	// StringBuilder1.java
	// 9/20/17
	// This will search for and exclude non letters from a string using their char code
	//*************************************************************

	public static class StringBuilder1 
	{
		public String string;
		public int[][] charCodeArray = new int[26][2];
		public int spaceCode;
		
		//Construct a StringBuilder1
		public StringBuilder1(String str)
		{
			string = str;
			makeCharArray();
		}
		
		private void makeCharArray() //Makes the character unicode value array
		{
			//I am aware of the method that will decrease the run time... I just made this first
			//Lowercase
			char y = 'a';
			charCodeArray[0][0] = y;
			y = 'b';
			charCodeArray[1][0] = y;
			y = 'c';
			charCodeArray[2][0] = y;
			y = 'd';
			charCodeArray[3][0] = y;
			y = 'e';
			charCodeArray[4][0] = y;
			y = 'f';
			charCodeArray[5][0] = y;
			y = 'g';
			charCodeArray[6][0] = y;
			y = 'h';
			charCodeArray[7][0] = y;
			y = 'i';
			charCodeArray[8][0] = y;
			y = 'j';
			charCodeArray[9][0] = y;
			y = 'k';
			charCodeArray[10][0] = y;
			y = 'l';
			charCodeArray[11][0] = y;
			y = 'm';
			charCodeArray[12][0] = y;
			y = 'n';
			charCodeArray[13][0] = y;
			y = 'o';
			charCodeArray[14][0] = y;
			y = 'p';
			charCodeArray[15][0] = y;
			y = 'q';
			charCodeArray[16][0] = y;
			y = 'r';
			charCodeArray[17][0] = y;
			y = 's';
			charCodeArray[18][0] = y;
			y = 't';
			charCodeArray[19][0] = y;
			y = 'u';
			charCodeArray[20][0] = y;
			y = 'v';
			charCodeArray[21][0] = y;
			y = 'w';
			charCodeArray[22][0] = y;
			y = 'x';
			charCodeArray[23][0] = y;
			y = 'y';
			charCodeArray[24][0] = y;
			y = 'z';
			charCodeArray[25][0] = y;
			
			//Uppercase
			y = 'A';
			charCodeArray[0][1] = y;
			y = 'B';
			charCodeArray[1][1] = y;
			y = 'C';
			charCodeArray[2][1] = y;
			y = 'D';
			charCodeArray[3][1] = y;
			y = 'E';
			charCodeArray[4][1] = y;
			y = 'F';
			charCodeArray[5][1] = y;
			y = 'G';
			charCodeArray[6][1] = y;
			y = 'H';
			charCodeArray[7][1] = y;
			y = 'I';
			charCodeArray[8][1] = y;
			y = 'J';
			charCodeArray[9][1] = y;
			y = 'K';
			charCodeArray[10][1] = y;
			y = 'L';
			charCodeArray[11][1] = y;
			y = 'M';
			charCodeArray[12][1] = y;
			y = 'N';
			charCodeArray[13][1] = y;
			y = 'O';
			charCodeArray[14][1] = y;
			y = 'P';
			charCodeArray[15][1] = y;
			y = 'Q';
			charCodeArray[16][1] = y;
			y = 'R';
			charCodeArray[17][1] = y;
			y = 'S';
			charCodeArray[18][1] = y;
			y = 'T';
			charCodeArray[19][1] = y;
			y = 'U';
			charCodeArray[20][1] = y;
			y = 'V';
			charCodeArray[21][1] = y;
			y = 'W';
			charCodeArray[22][1] = y;
			y = 'X';
			charCodeArray[23][1] = y;
			y = 'Y';
			charCodeArray[24][1] = y;
			y = 'Z';
			charCodeArray[25][1] = y;
			
			y = ' ';
			spaceCode = y;
		}
		
		//Finds and removes non alphabetical characters from the string
		public String findRemove()
		{
			boolean[] passed = new boolean[string.length()];
			for (int s = 0; s < string.length(); s++)
				passed[s] = false;
			
			for (int i = 0; i < string.length(); i++)
			{
				if ((int)string.charAt(i) == spaceCode)
				{
					passed[i] = true;
				}
				else
				{
					for (int j = 0; j < 2; j++)
					{
						for (int k = 0; k < 26; k++)
						{
							if ((int)string.charAt(i) == charCodeArray[k][j])
							{
								passed[i] = true;
								k = k + 50;
								j = j + 50;
							}
						}
					}
				}
				
				if (passed[i] == false)
					string = string.substring(0, i) + string.substring(i+1);
			}
			
			return string;
		}
		
	}
	//*************************************************************************
	// Nathan Schnitzer
	// StringBuilder2.java
	// 9/26/17
	// This program will utilize tokenizer and remove unwanted sybols
	//*************************************************************************

	public static class StringBuilder2 
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

	//************************************************************
	// Nathan Schnitzer
	// StringBuilder3.java
	// 9/26/17
	// This will utilize regular expression
	//************************************************************

	public static class StringBuilder3 
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

	
	}
	

}

