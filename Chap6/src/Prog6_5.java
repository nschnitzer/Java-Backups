//*********************************************************************
// Nathan Schnitzer
// Program 6.4
// 5/10/17
// This program will read values from 0-100 and display the amount of times 5 values were selected by 10s
//*********************************************************************

import java.util.Arrays;
import java.util.Random;

public class Prog6_5
{

	public static void main(String[] args) 
	{
		//Instantiate the arrays
		int[] occur = new int[100];
		int[] occurPerTen = new int[10];
		String[] displayOccur = new String[10];
		
		//Create Random Object
		Random gen = new Random();
		
		//Generate Random # 100 times
		for (int i = 1; i <= 100; i++)
		{
			int genned = gen.nextInt(100);
			occur[genned] = occur[genned]+ 1;
		}
		
		//Find the amount of occurences per 10
		for (int k = 0; k < 10; k++)
		{
			int count = 0;
			int sum10 = 0;
			
			for (int j = 0; j < 10; j++)
			{
				sum10 = sum10 + occur[k*10 + j];
			}
			count = count + 10;
			occurPerTen[k] = sum10;
		}
		int counter = 0;
		
		//Format the displayOccur array
		for (int q = 0; q < 10; q++)
		{
			
			displayOccur[q] = (counter + 1) + " - " + (counter + 10) + "     |\t";
			for (int d = 0; d < occurPerTen[q]/5; d++)
			{
				displayOccur[q] += "*";
			}
			System.out.println();
			counter += 10;
		}
		
		//Prints out the chart
		for (int p = 0; p < displayOccur.length; p++)
		{
			System.out.println(displayOccur[p]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(occurPerTen));
		System.out.println(Arrays.toString(occur));

	}

}
