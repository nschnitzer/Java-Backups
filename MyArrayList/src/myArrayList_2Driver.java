//******************************************************
// Nathan Schnitzer
// 11/6/17
// ArrListDriver.java
// This will test an ArrayList
//******************************************************

import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class myArrayList_2Driver 
{

	public static void main(String[] args) 
	{
		Random gen = new Random();
		
		myArrayList<Integer> list1 = new myArrayList<Integer>();
		myArrayList<String> list2 = new myArrayList<String>();
		
		//Tests the add method to the end of the list
		//myArrayList1/3
		list1.add(gen.nextInt(100));
		for (int i = 0; i < 17; i++)
		{
			int addedTo = gen.nextInt(list1.size());
			int added = gen.nextInt(100);
			list1.add((Integer) added);
			System.out.println("Added: " + added + "\tAdded To: " + addedTo);
		}
		
		list1.print();
		
		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println("****************************************************************************");
		System.out.println();
		System.out.println("MYARRAYLIST2");
		System.out.println();
		
		list2.add("Nameth");
		list2.add("Sauer");
		list2.add("Lammons");
		list2.add("Maynard");
		list2.add("Boozer");
		list2.add("Snell");
		list2.add("Atkinson");
		list2.add("Dockerny");
		list2.add("Ewbank");
		list2.add("Elliot");
		list2.add("Grantham");
		list2.add("Herman");
		list2.add("Hill");
		list2.add("Biggs");
		list2.add("Biggs");
		list2.add("Backer");
		list2.add("Baird");
		list2.add("Rasmussen");
		list2.add("Philbin");
		list2.add("Gordon");
		list2.add("Richards");
		list2.add("Finny");
		list2.print();
		try{list2.remove(-1);}
		catch(Exception e){System.out.println(e);}
		list2.print();
		
		try{list2.remove(0);}
		catch(Exception e){System.out.println(e);}
		list2.print();
		
		try{list2.remove(3);}
		catch(Exception e){System.out.println(e);}
		list2.print();
		
		try{list2.remove(5);}
		catch(Exception e){System.out.println(e);}
		list2.print();
		
		try{list2.remove(25);}
		catch(Exception e){System.out.println(e);}
		list2.print();
		
		/*
		  "Nameth", "Sauer", "Lammons", "Maynard", "Boozer", "Snell", "Atkinson", "Dockerny", "Ewbank", "Elliot", "Grantham", "Herman", "Hill", "Biggs","Backer", "Baird", "Rasmussen",
"Philbin", "Gordon", "Richards", "Finny"
		 */
		
		//myArrayList3
		//Add(int index, E e)
		System.out.println();
		System.out.println("myArrayList3");
		System.out.println();
		try{list2.add(-2,"Joe");}
		catch(Exception e){System.out.println(e);}
		list2.print();
		
		System.out.println();
		list2.add(0, "Bill");
		list2.print();
		
		System.out.println();
		list2.add(5, "Unitas");
		list2.print();
		
		System.out.println();
		list2.add(12, "Smith");
		list2.print();
		int num = list2.size();
		
		System.out.println();
		list2.add(num, "Gill");
		list2.print();
		
		System.out.println();
		try{list2.add(101, "Bradley");}
		catch(Exception e){System.out.println(e);}
		list2.print();
		

	}

}


