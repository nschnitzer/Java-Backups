//**********************************************************************
// Nathan Schnitzer
// Sorts.java
// 11/2/17
// This will contain methods that will sort arrays
//**********************************************************************

public class Sorts 
{
	//Creates constructor
	public Sorts()
	{
		
	}
	
	//Sorts the array using the insertion sort algorithm
	public static int[] Sort(int[] array1)
	{
		 int n = array1.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array1[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array1 [i] > key ) ) {  
	                array1 [i+1] = array1 [i];  
	                i--;  
	            }  
	            array1[i+1] = key;  
	        } 
		return array1;
	}
	
	//Sorts the array using the insertion sort algorithm starts at an index
		public static void delSort(int[] array1, int index)
		{
			int temp;
		    for (int i = index+1; i < array1.length-1; i++) 
		    {
			    for(int j = i ; j > 0 ; j--)
			    {
				    if(array1[j] < array1[j-1])
				    {
					    temp = array1[j];
					    array1[j] = array1[j-1];
					    array1[j-1] = temp;
				    }
			    }
		    }
		}
		
		//Sorts the array using the insertion sort algorithm starts at an index
		public static void insSort(int[] array1, int index)
		{
			int temp;
		    for (int i = index; i < array1.length-1; i++) 
		    {
			    for(int j = i ; j > 0 ; j--)
			    {
				    if(array1[j] < array1[j-1])
				    {
					    temp = array1[j];
					    array1[j] = array1[j-1];
					    array1[j-1] = temp;
				    }
			    }
		    }
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
	

}
