//**************************************************************
// Nathan Schnitzer
// InsDelDriver.java
// 11/2/17
// This will test the insertNumInArray and removeNumInArray methods
//**************************************************************

public class InsDelDriver 
{

	public static void main(String[] args) 
	{
		//Make an array
		int[] arr1 = {10, 20, 30, 40, 50, 60};
		
		//Sort the array
		Sorts.Sort(arr1);
		
		//Delete the 3rd element
		ManuverMethods.removeNumInArray(arr1, 3);
		System.out.println();
		int[] arr2 = {20, 30, 40, 50, 60, 70, 0};
		InsertNum.insertNumInArray(arr2, 2, 35);
	}

}
