import java.util.Arrays;

//*********************************************************
// Nathan Schnitzer
// BubbleSortTest.java
// 10/31/17
// This will create a method that will test a bubble Sort
//*********************************************************

public class BubbleSortTest 
{
	
	public BubbleSortTest()
	{
		
	}
	
	public static void bubbleSort(int[] array)
	{
		for (int i = 0; i < array.length-1; i++)
		{
			int position = i;
			for (int j = position + 1; j < array.length; j++)
			{
				if (array[position] > array[j])
				{
					int temp = array[position];
					array[position] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}

/*
 * Test:
 * public static void main(String[] args) 
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
