//******************************************************************
// Nathan Schnitzer
// Reverse.java
// 9/25/17
// This will reverse an array
//******************************************************************


public class Reverse 
{
	public static int[] array0;
	
	//Constructs a Reverse object
	public Reverse()
	{
		
	}
	
	//Reverses an array
	public static int[] reverseArray(int[] array)
	{
		array0 = new int[array.length];
		int limit = array.length;
		int position = limit-1;
		int[] reversed = new int[limit];
		
		for (int i = 0; i < limit; i++)
		{
			reversed[position] = array[i];
			position--;
		}
		
		array0 = reversed;
		
		return reversed;
	}
	
	//Reverses an array recursively
	public static int[] reverseArray(int[] array, int i, int j)
	{
		array0 = new int[array.length];
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		while (i < j)
		{
			reverseArray(array, ++i, --j);
		}
		array0 = array;
		
		return array;
	}
	
	//Returns array0
	public int[] getArray()
	{
		return array0;
	}

}
