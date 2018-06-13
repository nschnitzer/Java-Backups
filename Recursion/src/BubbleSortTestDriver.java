import java.util.Arrays;

//******************************************************
// Nathan Schnitzer
// BubbleSortTestDriver.java
// 10/31/17
// This will test a bubble sort
//******************************************************

public class BubbleSortTestDriver 
{

	public static void main(String[] args) 
	{
		int[] arr = {14, 7, 32, 19, 4, 21, 63, 12};
		System.out.println(Arrays.toString(arr));
		
		BubbleSortTest.bubbleSort(arr);
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		/*
		 * Output:
		 * [14, 7, 32, 19, 4, 21, 63, 12]

		   [4, 7, 12, 14, 19, 21, 32, 63]
		 */
		
	}

}
