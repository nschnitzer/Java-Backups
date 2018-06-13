//*********************************************************************
// Nathan Schnitzer
// Display.java
// 12/1/17
// This will display the current methods working as of 12/1/17 in myArrayList
//**********************************************************************

import java.util.Random;
import java.util.Arrays;

public class Display 
{

	public static void main(String[] args) 
	{
		Random gen = new Random();
		myArrayList<String> list = new myArrayList<String>();
		list.add("Jimmy");
		list.add("Mike");
		list.add("Joe");
		list.add("Doug");
		list.add("Eric");
		list.add("Trevor");
		list.add("Ben");
		list.add("Bill");
		list.add("Alex");
		list.add("Rob");
		
		//print()
		System.out.println("Printing out list...");
		list.print();
		
		//size()
		System.out.println();
		System.out.println("Displaying the size of the arraylist");
		System.out.println(list.size());
		
		//add(int index, E e)
		System.out.println();
		System.out.println("Adding 'Jerry' into index 3...");
		list.add(3, "Jerry");
		System.out.println("Done. Printing...");
		list.print();
		
		//set(int index, E e)
		System.out.println();
		System.out.println("Changing index 5 to 'Marcus'...");
		list.set(5, "Marcus");
		System.out.println("Done.");
		list.print();
		
		//get(int x)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Retreiving element in index 6...");
		System.out.println("Done.");
		System.out.println(list.get(6));
		
		
		//indexOf(E e)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Finding first occurance of 'Joe'...");
		System.out.println("Done.");
		System.out.println(list.indexOf("Joe"));
		
		//remove(E e)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Removing all occurances of 'Joe'...");
		System.out.println("Size: " + list.size());
		list.remove("Joe");
		System.out.println("Done.");
		System.out.println("Size: " + list.size());
		
		//remove(int x)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Removing element at random index...");
		System.out.println("Size: " + list.size());
		list.remove(gen.nextInt(list.size()));
		System.out.println("Done");
		System.out.println("Size: " + list.size());
		
		
		//subList(int from, int to)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Creating a new subList from 3 to 7...");
		myArrayList<String> subList;
		subList = list.subList(3, 7);
		System.out.println("Done.");
		subList.print();
		
		
		//contains(E e)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Determining if 'Dennis' is in the array list...");
		System.out.println("Done.");
		System.out.println(list.contains("Dennis"));
		
		//addAll(E[] newData)
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Adding an array of strings to the arraylist...");
		String[] newData = {"Brady", "Paul", "George", "Larry"};
		list.addAll(newData);
		System.out.println("Done.");
		list.print();
		
		//toString()
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Converting the list to an array...");
		Object[] arrData = list.toArray();
		System.out.println("Done.");
		System.out.println(Arrays.toString(arrData));
		
		
		//lastIndexOf(E e)
		System.out.println();
		list.add("Mike");
		list.add("Eric");
		System.out.println(list.lastIndexOf("Mike"));
		list.print();
		
		//isEmpty()
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Testing if the arraylist is empty...");
		System.out.println("Done.");
		System.out.println(list.isEmpty());
		
		//clear()
		System.out.println();
		list.print();
		System.out.println();
		System.out.println("Clearing all elements from the arraylist...");
		list.clear();
		System.out.println("Done.");
		
		//isEmpty()
		System.out.println();
		System.out.println();
		System.out.println("Testing if the arraylist is empty...");
		System.out.println("Done.");
		System.out.println(list.isEmpty());
		
		
		

	}

}
