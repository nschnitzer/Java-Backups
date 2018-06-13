import java.util.Arrays;

//************************************************************
// Nathan Schnitzer
// NewDriver.java
// 9/25/17
// This will utilize the reverseArray and Palindrome methods
//************************************************************

import java.util.Random;

public class NewDriver 
{

	public static void main(String[] args) 
	{
		//Instantiate a random object
		Random randy = new Random();
		
		//Create new pdrome objects
		Pdrome pdrome1 = new Pdrome();
		Pdrome pdrome2 = new Pdrome();
		
		//Check if pdromes are palindromes
		if (pdrome1.palindrome("sagas"))
			System.out.println("A palindrome");
		else
			System.out.println("Not a palindrome");
		
		if (pdrome2.palindrome("terminator"))
			System.out.println("A palindrome");
		else
			System.out.println("Not a palindrome");
		
		System.out.println();
		System.out.println();
		
		//Create new reverse objects
		int[] arr1 = new int[4];
		for (int i = 0; i < arr1.length;i++)
			arr1[i] = randy.nextInt(28);
		
		Reverse rev = new Reverse();
		rev.reverseArray(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(rev.getArray()));
		//System.out.println(Arrays.toString(rev.reverseArray(arr1)));
		
		//Create new BinarySearches objects
		int[] arr2 = new int[14];
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = randy.nextInt(14);
		int[] arr3 = new int[26];
		for (int i = 0; i < arr3.length; i++)
			arr3[i] = randy.nextInt(26);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		BinarySearcher bin1 = new BinarySearcher(arr2);
		BinarySearcher bin2 = new BinarySearcher(arr3);
		System.out.println();
		bin1.binarySearch(7);
		bin2.binarySearch(15);

	}

}
