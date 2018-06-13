import java.util.Arrays;

//**************************************************************************
// Nathan Schnitzer
// InsertNum.java
// 11/2/17
// This class will contain methods that add elements to an array and emulates an array list
//**************************************************************************

public class InsertNum 
{
	//Create constructor
	public InsertNum()
	{
		
	}
	
	//Adds a element into an array in a certain index
	public static void insertNumInArray(int[] array, int index, int value)
	{
		//Print out the array before the add
		System.out.println("Before...");
		System.out.println(Arrays.toString(array));
		array[index] = array[array.length-1];
		array[index] = value;
		Sorts.insSort(array, index);
		
		//Print the array after the add
		System.out.println();
		System.out.println("After...");
		System.out.println(Arrays.toString(array));
	}

}
