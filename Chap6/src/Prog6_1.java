//*******************************************************************
// Nathan Schnitzer
// Program 6.1
// 4/25/17
// This program will read and store integers, then count how many times each was counted
//********************************************************************

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog6_1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//Prompt for the amount of times
		//System.out.println("How many times do you want to generate?");
		//int suggestion = scan.nextInt();
		
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
		
		/*Instantiate the Random object
		Random gen = new Random();
		
		//Runs the loop 100 times
		for (int k = 0; k < suggestion; k++)
		{
			//generates a random number
			incomming = gen.nextInt(51);
			System.out.println(incomming);
			
			tracker[incomming]++;
		} */
		
		int[] input = {14, 16, 2, 3, 5, 16, 28, 50, 1, 2, 33, 16, 1, 2, 50, 42, 48, 50, 1, 16};
		for (int k = 0; k < input.length; k++)
		{
			tracker[input[k]]++;
		}
		
		for (int p = 0; p < tracker.length; p++)
		{
			System.out.println(compare[p] + ": " + tracker[p]);
		}
		
		System.out.println();
		
		//Print out the tracker array
		System.out.println(Arrays.toString(tracker));
		System.out.println(Arrays.toString(compare));
		System.out.println(tracker.length);

	}

}


/* OUTPUT:
 0: 0
1: 3
2: 3
3: 1
4: 0
5: 1
6: 0
7: 0
8: 0
9: 0
10: 0
11: 0
12: 0
13: 0
14: 1
15: 0
16: 4
17: 0
18: 0
19: 0
20: 0
21: 0
22: 0
23: 0
24: 0
25: 0
26: 0
27: 0
28: 1
29: 0
30: 0
31: 0
32: 0
33: 1
34: 0
35: 0
36: 0
37: 0
38: 0
39: 0
40: 0
41: 0
42: 1
43: 0
44: 0
45: 0
46: 0
47: 0
48: 1
49: 0
50: 3

[0, 3, 3, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 3]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
51
*/
