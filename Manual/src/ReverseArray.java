//*************************************************************
// Nathan Schnitzer
// Reversing an Array
// 4/27/17
// This program will read an array and reverse the order it is stored
//*************************************************************

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int elements = 0;
		
		//Prompt for the amount of elements
		System.out.println("Please enter the amount of elements to be entered");
		elements = scan.nextInt();
		
		int[] normal = new int[elements];
		//int[] helpRev = new int[elements]; //Will be used to help reverse normal
		
		//Prompt for the elements in array
		for (int i = 0; i < elements; i++)
		{
			System.out.println("Enter a element");
			normal[i] = scan.nextInt();
		}
		
		//Print normal before
		System.out.println();
				System.out.println("Before reverse: " + Arrays.toString(normal));
				
		//set helpRev to reversed normal
		int count = 0;
		for (int p = elements - 1; p >= elements/2; p--)
		{
			int temp = normal[count];
			normal[count] = normal[p];
			normal[p] = temp;
			count++;
		}
		
		
		/*set normal as an alias to helpRev
		for (int o = 0; o < elements; o++)
		{
			normal[o] = helpRev[o];
		} */
		
		//Print normal after
		System.out.println("After reverse: " + Arrays.toString(normal));
		
		
		scan.close();

	}

}
