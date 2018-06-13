//********************************************************
// Nathan Schnitzer
// Sorts.java Program 6.3
// 5/9/17
// This program will modify the sorts class and sort sets in decreasing order
//********************************************************

public class Sorts 
{
	public static int[] selectionSort (int[] numbers)
	{
		int max, temp;
		
		//Sorts the integers using selection sort algorithm
		for (int index = 0; index < numbers.length-1; index++)
		{
			max = index;
			for (int scan = index+1; scan < numbers.length; scan++)
			{
				if (numbers[scan] > numbers[max])
				{
					max = scan;
				}
			}
			
			//swap the values
			temp = numbers[max];
			numbers[max] = numbers[index];
			numbers[index] = temp;
		}
		
		return numbers;
	}
	
	//Sorts using the Insertion Sort Algorithm ascending
	public static int[] insertionSort (int[] numbers)
	{
		for (int index = 1; index < numbers.length; index++)
		{
			int temp;
			int key = numbers[index];
			int position = index;
			
			//shift larger values to the right
			while (position > 0 && numbers[position-1] < key)
			{
				temp = numbers[position-1];
				numbers[position-1] = numbers[position];
				numbers[position] = temp;
				position--;
			}
			numbers[position] = key;
		}
		
		return numbers;
	}
	
	//Sorts the arrays of objects with the insertion sort algorithm
	public static Comparable[] insertionSort (Comparable[] objects)
	{
		for (int index = 1; index < objects.length; index++)
		{
			Comparable key = objects[index];
			int position = index;
			
			//shift larger values to the right
			while (position > 0 && objects[position-1].compareTo(key) > 0)
			{
				objects[position] = objects[position-1];
				position--;
			}
			objects[position] = key;
		}
		return objects;
	}

}
