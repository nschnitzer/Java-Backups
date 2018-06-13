//***************************************************************
// Nathan Schnitzer
// Program 6_3
// 5/9/17
// This will sort a set of data with in decreasing order
//***************************************************************

import java.util.Arrays;
import java.util.Scanner;

public class Prog6_3 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int[] original = new int[6];
		//int[] original = {6, 1, 8, 3, 5, 7};
		
		//Prompt for 6 values
		System.out.println("Please enter 6 integer values...");
		for (int i = 0; i < 6; i++)
		{
			original[i] = scan.nextInt();
		}
		System.out.println();
		
		//Print the original
		System.out.println("Original Array");
		System.out.println(Arrays.toString(original));
		
		//Call the Selection and Insertion sort methods
		
		//Insertion
		int[] insertion = Sorts.insertionSort(original);
		System.out.println("Insertion Sort:");
		System.out.println(Arrays.toString(insertion));
		
		//Selection
		int[] selection = Sorts.selectionSort(original);
		System.out.println("Selection Sort:");
		System.out.println(Arrays.toString(selection));
		
		scan.close();
		
	}

}
