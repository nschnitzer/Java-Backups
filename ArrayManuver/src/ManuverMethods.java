import java.util.Arrays;

//*********************************************************
// Nathan Schnitzer
// RemoveNum.java
// 11/2/17
// This will contain methods that will add or remove a num from a array
//*********************************************************

public class ManuverMethods 
{
	//Create Constructor
	public ManuverMethods()
	{
		
	}
	
	
	//Removes a certain element from the array
		public static void removeNumInArray(int[] array, int index)
		{
			//Print out before remove
			System.out.println("Before...");
			System.out.println(Arrays.toString(array));
			System.out.println();
			
			//Switch the index to the last position and change it to 0
			array[index] = array[array.length-1];
			array[array.length-1] = 0;
			//Sort the array
			Sorts.delSort(array, index);
			
			//Print out the Array
			System.out.println("After...");
			System.out.println(Arrays.toString(array));
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


/* Main:
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
	ManuverMethods.insertNumInArray(arr2, 2, 35);
}
*/

/* Output:
 * Before...
[10, 20, 30, 40, 50, 60]

After...
[10, 20, 30, 50, 60, 0]

Before...
[20, 30, 40, 50, 60, 70, 0]

After...
[20, 30, 35, 50, 60, 70, 0]

 */