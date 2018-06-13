//*******************************************************************
// Nathan Schnitzer
// Program 6.1
// 4/25/17
// This program will read and store integers, then count how many times each was counted
//********************************************************************

import java.util.Arrays;
import java.util.Random;

public class Prog6_2
{

	public static void main(String[] args) 
	{
		int[] compare = new int[51];
		int[] tracker = new int[51];
		int incomming;
		//sets all tracker elements to 0
		for (int i = 0; i <= 50; i++)
		{
			tracker[i] = 0;
		}
		
		//sets compare elements to their index
		for (int s = 0; s <= 50; s++)
		{
			compare[s] = s;
		}
		
		//Instantiate the Random object
		Random gen = new Random();
		
		//Runs the loop 100 times
		for (int k = 0; k < 100; k++)
		{
			//generates a random number
			incomming = gen.nextInt(51) - 25;
			if (incomming < 0)
			{
				System.out.println(incomming);
				incomming = Math.abs(incomming) + 25;
			}
			System.out.println(incomming);
			
			tracker[incomming]++;
		}
		
		//Print out the tracker array
		System.out.println(Arrays.toString(tracker));
		System.out.println(Arrays.toString(compare));
		
		//Print out the indivisual elements
		System.out.println();
		System.out.println();
		
		for (int d = 26; d < 51; d++)
		{
			System.out.println(((d-25) * -1) + ": \t" + tracker[d]);
			System.out.println();
		}
		for (int s = 0; s <= 25; s++)
		{
			System.out.println(s + ": \t" + tracker[s]);
			System.out.println();
		}

	}

}
