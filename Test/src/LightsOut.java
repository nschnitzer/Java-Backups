//***********************************************
// Nathan Schnitzer
// 3/1/17
//********************************

import java.util.Arrays;
import java.util.Scanner;

public class LightsOut {

	public static void main(String[] args) {
		int rowAmount;
		int strNumbers = 0;
		int indicateTile;
		Scanner scan = new Scanner(System.in);
		boolean[] power = new boolean[64];
		String[] position = new String[64];
		String[] desc = new String[64];
		int[] locOn = new int[64];
		int locCount = 0;
		
		//Set all desc values to "none" and all locOn[] to 0
		for (int a = 0; a < 64; a++)
		{
			desc[a] = "";
			locOn[a] = 0;
		}
		
		
		int oneInput = 1;
		rowAmount = 4;
		String[] locations = new String[rowAmount];
		
		for (int w = 0; w < rowAmount; w++)
		{
			System.out.println("Enter a string:");
			locations[w] = scan.next();
			strNumbers = w;
		}
		
		//Prompt for the tile indication string
		System.out.println("Enter the location of the pressed tile");
		indicateTile = 54;
		
		System.out.println(Character.toString(locations[0].charAt(0)));
		
		//set all power[] values to false
		for (int k = 0; k < 64; k++)
		{
			power[k] = false;
		}
		
		//set all value[] values to its position
		// i is the row & m is the column (0,0) is top right
		for (int i = 0; i < 8; i++)
		{
			for (int m = 0; m < 8; m++)
			{
				//Array its on
				int n = (i*8) + m;
				position[n] = "" + i + m;
			}
		}
		
		int length;
		String[] columns = new String[rowAmount];
		String[] rows = new String[rowAmount];
		String row;
		String loc = "";
		for (int r = 0; r <= strNumbers; r++)
		{
			length = locations[r].length();
			row = Character.toString(locations[r].charAt(0));
			boolean match = false;
			int mark = 0;
			for (int o = 1; o <
					length; o++)
			{
				columns[mark] = Character.toString(locations[r].charAt(o));
				loc = row.concat(columns[mark]);
				for (int s = 0; s < 64; s++)
				{
					if (position[s].equals(loc))
					{
					locOn[locCount] = s;
					locCount++;
					power[s] = true;
					mark++;
					}
				}
			}
		}
		int tracker = 0;
		while(tracker < 64)
		{
		boolean tenDown = false, tenUp = false, oneDown = false, oneUp = false;
		
			if (indicateTile - 70 > -1)
			{
				indicateTile -= 14;
			}
			else if (indicateTile - 60 > -1)
			{
				indicateTile -= 12;
			}
			else if (indicateTile - 50 > -1)
			{
				indicateTile -= 10;
			}
			else if (indicateTile - 40 > -1)
			{
				indicateTile -= 8;
			}
			else if (indicateTile - 30 > -1)
			{
				indicateTile -= 6;
			}
			else if (indicateTile - 20 > -1)
			{
				indicateTile -= 4;
			}
			else if (indicateTile - 10 > -1)
			{
				indicateTile -= 2;
			}
			
		tracker += 64;

		//Set the pressed tiles values
		power[indicateTile] = true;
		
		
		//Set all tiles values adjacent to pressed tile
		if (indicateTile > 10)
		{
		desc[indicateTile - 8] = "adjacent a";
		tenDown = true;
		}
		if (!(indicateTile >= 54))
		{
			desc[indicateTile+8] = "adjacent a";
			tenUp = true;
		}
		
		if (indicateTile > 0) 
		{
			desc[indicateTile -1] = "adjacent a";
			oneDown = true;
		}
		
		if (indicateTile < 64)
		{
			desc[indicateTile + 1] = "adjacent a";
			oneUp = true;
		}
		}
		
		for (int j = 0; j<locCount; j++)
		{
	
			if (locOn[j] > 9)
			{
			desc[locOn[j]-8] += " adjacent b";
			}
			if (!(locOn[j] >= 54))
			{
				desc[locOn[j]+8] += " adjacent b";
			}
			
			if (locOn[j]> 0)
			{
				desc[locOn[j] -1] += " adjacent b";
			}
			
			if (locOn[j]<64)
			{
				desc[locOn[j] + 1] += " adjacent b";
			}
		
		
		
		}
		int count = 0;
		for (int x = 0; x < 64; x++)
		{
			if ((!(desc[x].equals(""))) && power[x] == false)
			{
				desc[x] = "chosen";
				count++;
			}
		}
		System.out.println(Integer.valueOf(loc));
		System.out.println(loc);
		System.out.println(Character.toString(locations[0].charAt(0)));
		System.out.println(Arrays.toString(power));
		System.out.println(Arrays.toString(position));
		System.out.println(Arrays.toString(desc));
		System.out.println(count);
		System.out.println("" + desc[18] + " " + power[18]);
	

}

}