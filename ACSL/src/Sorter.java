import java.util.Arrays;

//***************************************************************
// Nathan Schnitzer
// BinarySearch.java
// 9/29/17
// This program will perform a binary search using recursion
//***************************************************************


public class Sorter 
{
	public int[] arr1;
	public static int[] sorted;
	boolean found = false;
	public static int pos;
	
	//Constructs a BinarySearcher object
	public Sorter(int[] array)
	{
		arr1 = array;
		sorted = Sorter.Sort(arr1);
		pos = (sorted.length-1)/2;
	}
	
	//Sorts the array using the insertion sort algorithm
	public static int[] Sort(int[] array1)
	{
	        for (int j = 1; j < array1.length; j++) {  
	            int key = array1[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array1 [i] > key ) ) {  
	                array1 [i+1] = array1 [i];  
	                i--;  
	            }  
	            array1[i+1] = key;  
	        } 
		
		pos = pos/2;
		return array1;
	}
	
	//Sorts the array using a Selection Sort algorithm
	public static int[] selectionSort(int[] arr)
	{  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	        return arr;
	    }  
	
	
	//Perform a binary search
	public int binarySearch(int find)
	{
		if (checkFind(find))
		{
			if (find == sorted[pos])
				{
				return pos;
				}
			else if(find < sorted[pos])
				return binarySearch(find, pos/2);
			else
				return binarySearch(find, (int)(pos*1.5));
		}
		else
		{
			return -1;
		}
				
	}
	
	//Performs a binary Search semi recursively
	public int binarySearch(int find, int pos)
	{
		if (find == sorted[pos])
		{
			return pos;
		}
		final int LIMIT = (int)Math.sqrt(arr1.length);
		if(find < sorted[pos])
			return binarySearch(find,(int)(pos/2.0));
		else
		{
			return binarySearch(find, (int)(pos*1.5));
		}
	}
	
	//Checks if the value is in the array
	public boolean checkFind(int find)
	{
		boolean found = false;
	
		for (int i = 0; i < sorted.length; i++)
		{
			if (find == sorted[i])
			{
				found = true;
			}
		}
		return found;
	}
	
	//Uses a binary Search to find a method
	public static int binarySearch(int[] array, int find, int x, int y)
	{
		array = Sorter.selectionSort(array);
		
		//If the value is not in the array
		if (x > y)
			return -1;
		
		//If the mid element is what we are searching for 
		if (find == array[(x+y)/2])
		{
			return (x+y)/2;
		}
		else if (find < array[(x+y)/2]) //If it is less than the mid element
		{
			return Sorter.binarySearch(array, find, x, ((x+y)/2)-1);
		}
		else //If it is more than the mid element
		{
			return Sorter.binarySearch(array, find, ((x+y)/2)+1, y);
		}
		
		
	}

}
