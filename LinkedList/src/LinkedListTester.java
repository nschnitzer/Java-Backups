import java.util.NoSuchElementException;

//************************************************************
// Nathan Schnitzer
// LinkedListTester.java
// 1/9/18
// This will test the LinkedList data structure
//************************************************************

import java.io.LineNumberReader;

public class LinkedListTester 
{

	public static void main(String[] args) throws NullPointerException, IllegalStateException
	{
		LinkedList1<String> list = new LinkedList1<String>();
		
		//Add nodes
		list.add("Namath");
		list.add("Sauer");
		list.add("Maynard");
		list.add("Snell");
		list.add("Duckery");
		list.add("Atkinson");
		list.add("Sample");
		list.add("Biggs");
		
		list.printList();
		
		System.out.println(list.get(4));
		System.out.println();
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list.toStringAddress());
		System.out.println();
		
		//Add more nodes
		list.addFirst("Gill");
		list.add(0, "Bradshaw");
		list.add(10, "Swann");
		try{
			list.add(100, "Stallworth");
		}
		catch(NullPointerException e)
		{
			StackTraceElement st = new StackTraceElement("LinkedList1", "add", null, 137);
			System.out.println("Line #: " + st.getLineNumber() + " Cannot insert at " + 100);
		}
		try
		{
			list.add(-4, "Murray");
		}
		catch (NullPointerException e)
		{
			StackTraceElement st = new StackTraceElement("LinkedList1", "add", null, 137);
			System.out.println("Line #: " + st.getLineNumber() + " Cannot insert at -4");
		}
		try
		{
			list.add(1800, "Tuesday");
		}
		catch (NullPointerException e)
		{
			StackTraceElement st = new StackTraceElement("LinkedList1", "add", null, 137);
			System.out.println("Line #: " + st.getLineNumber() + " Cannot insert at 1800");
		}
		list.add(4, "Lambert"); 
		list.add(7, "Tatum"); 
		list.add(10, "Harris"); 
		list.printList();
		System.out.println();
		System.out.println();
		
		//test get method
		try{System.out.println(list.get(-1));
		}catch(NoSuchElementException e){
			StackTraceElement st = new StackTraceElement("LinkedList1", "get", null, 205);
			System.out.println("Line #: " + st.getLineNumber() + " No element exists at -1 position");
			};
		
		try{System.out.println(list.get(1000));
		}catch(NoSuchElementException e){
			StackTraceElement st = new StackTraceElement("LinkedList1", "get", null, 205);
			System.out.println("Line #: " + st.getLineNumber() + " No element exists at 1000 position");
			};
	
		try{System.out.println(list.get(list.size()));
		}catch(NoSuchElementException e)
		{
			StackTraceElement st = new StackTraceElement("LinkedList1", "get", null, 205);
			System.out.println("Line #: " + st.getLineNumber() + " No element exists at that position");};
		
		
		System.out.println();
		//Print uppercase and lowercase
		System.out.println("Getting all values...");
		for (int i = 0; i < list.size(); i++)
		{
			if (i% 2 == 0)
			System.out.println(list.get(i).toUpperCase());
			else
				System.out.println(list.get(i).toLowerCase());
		}
		
		//Demonstrate the delPosition method
		System.out.println();
		
		String error = "Cant remove from this index";
		System.out.println("remove() Try-Catches:");
		try
		{
			System.out.println(list.remove(list.size()));
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		try
		{
			System.out.println(list.remove(1000));
		}
		catch (NullPointerException e)
		{	
			e.printStackTrace();
		}
		try
		{
			System.out.println(list.remove(-5));
		}
		catch (IllegalStateException e)
		{
			e.printStackTrace();
		} 
		
		System.out.println();
		System.out.println("Before removes: " + list.toString());
		System.out.println();
		System.out.println("Removed: " + list.remove(0));
		System.out.println("Removed: " + list.remove(list.size()-1));
		System.out.println("Removed: " + list.remove(2));
		System.out.println("Removed: " + list.remove(5));
		System.out.println("Removed: " + list.remove(7));
		System.out.println("Removed: " + list.remove(0));
		
		System.out.println();
		System.out.println("New List:");
		System.out.println(list.toString());
		//System.out.println(list.counterToString());
		
		//Try set()
		System.out.println();
		System.out.println("Set: " + list.set(4, "Jerry"));
		System.out.println(list.toString());
		System.out.println("Removing Jerry...");
		list.remove("Jerry");
		System.out.println(list.toString());
		
		System.out.println();
		list.add("Namath");
		list.add("Snell");
		list.printList();
	//	LinkedList1.removeDupes(list);
		list.printList();
		
		System.out.println();
		list.printList();
		list.set(0, "Bradshaw");
		list.set(2, "Swann");
		list.set(list.size()-1, "Harris");
		list.set(4, "Stallworth");
		list.printList();
		try 
		{
			list.set(list.size(), "Gill");
		}
		catch (IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		try
		{
			list.set(-2, "Gill");
		}
		catch (IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
	}

}
