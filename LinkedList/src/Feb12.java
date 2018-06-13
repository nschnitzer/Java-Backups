//*******************************************************
// Nathan Schnitzer
// Feb12.java
//*******************************************************

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Feb12 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter -1 to stop inputting...");
		int input = scan.nextInt();
		while(input != -1)
		{
			arr.add(input);
			input = scan.nextInt();
		}
		
		//Find odd numbers
		ArrayList<Integer> oddNums = new ArrayList<Integer>();
		ArrayList<Integer> evenNums = new ArrayList<Integer>();
		ArrayList<Integer> negNums = new ArrayList<Integer>();
		ArrayList<Integer> posNums = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++)
		{
			if ((int)arr.get(i) % 2 == 1)
			{
				oddNums.add(arr.get(i));
			}
			else
				evenNums.add(arr.get(i));
			
			if ((int)arr.get(i) > 0)
			{
				posNums.add(arr.get(i));
			}
			else
				negNums.add(arr.get(i));
		}
		
		
		System.out.println(arr.toString());
		System.out.println(oddNums.toString());
		System.out.println(evenNums.toString());
		System.out.println(posNums.toString());
		System.out.println(negNums.toString());

	}

}
