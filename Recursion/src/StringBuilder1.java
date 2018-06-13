import java.util.Arrays;

//*************************************************************
// Nathan Schnitzer
// StringBuilder1.java
// 9/20/17
// This will search for and exclude non letters from a string using their char code
//*************************************************************

public class StringBuilder1 
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
		//print out array
		//System.out.println(Arrays.deepToString(charCodeArray));
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
