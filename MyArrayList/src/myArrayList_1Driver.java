//***********************************************************************
// Nathan Schnitzer
// myArrayList_1Driver.java
// 11/22/17
//***********************************************************************

import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class myArrayList_1Driver 
{

	public static void main(String[] args) 
	{
		Random gen = new Random();
		
		myArrayList<String> listGeneric = new myArrayList<String>();
		myArrayList listRaw = new myArrayList();
		String[] playerList = {"Nameth", "Sauer", "Lammons", "Maynard", "Boozer", "Snell", "Atkinson", "Dockerny", "Ewbank", "Elliot", "Grantham", "Herman", "Hill", "Biggs","Backer", "Baird", "Rasmussen",
				"Philbin", "Gordon", "Richards", "Finny"};
		
		//Add the strings from playerList to listGeneric
		System.out.println("Adding elements to the Generic List...");
		for (int i = 0; i < playerList.length; i++)
		{
			listGeneric.add(playerList[i]);
		}
		System.out.println("Done.");
		
		//Add the strings from playerList to listRaw
		System.out.println();
		System.out.println("Adding elements to the Raw type list...");
		for (int i = 0; i < playerList.length; i++)
		{
			listRaw.add(playerList[i]);
		}
		System.out.println("Done.");
		
		//Printing listGeneric after calling the toUpperCase method
		System.out.println();
		System.out.println("Printing Generic List in all uppercase...");
		for (int i = 0; i < listGeneric.size(); i++)
		{
			System.out.println(listGeneric.get(i).toUpperCase());
		}
		System.out.println("Done.");
		
		//Printint listRaw after casting to a String and calling the toUpperCase method
		System.out.println();
		System.out.println("Printing Raw List in all uppercase...");
		for (int i = 0; i < listRaw.size(); i++)
		{
			System.out.println(((String)listRaw.get(i)).toUpperCase());
		}
		System.out.println("Done.");
		
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
		System.out.println("MYARRAYLIST2");
		System.out.println("****************************************************************************");
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
		System.out.println("********************************************************");
		System.out.println("myArrayList3");
		System.out.println("********************************************************");
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
		
		
		//Arraylist4
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("ArrayList4");
		System.out.println("*******************************************************");
		System.out.println();
		
		
		System.out.println(listGeneric.set(9, "Sam"));
		System.out.println(listGeneric.set(5, "Namath"));
		System.out.println(listGeneric.set(18, "Manning"));
		try{System.out.println(listGeneric.set(50, "Bond"));}
		catch(Exception e){System.out.println(e);}
		System.out.println();
		
		//Print out arraylist in lowercase
		for (int i = 0; i < listGeneric.size(); i++)
		{
			System.out.println(listGeneric.get(i).toLowerCase());
		}
		
		//ArrayList5
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("ArrayList5");
		System.out.println("***********************************************");
		System.out.println();
		
		System.out.println(listGeneric.removeFirstIndex("Sansa"));
		System.out.println(listGeneric.removeFirstIndex("Herman"));
		System.out.println(listGeneric.removeFirstIndex("Nameth"));
		System.out.println();
		
		//Printing out arraylist in uppercase
		for (int i = 0; i < listGeneric.size(); i++)
		{
			System.out.println(listGeneric.get(i).toUpperCase());
		}

}
	
}

/*
 * Adding elements to the Generic List...
Calling Reallocate...
Calling Reallocate...
Done.

Adding elements to the Raw type list...
Calling Reallocate...
Calling Reallocate...
Done.

Printing Generic List in all uppercase...
NAMETH
SAUER
LAMMONS
MAYNARD
BOOZER
SNELL
ATKINSON
DOCKERNY
EWBANK
ELLIOT
GRANTHAM
HERMAN
HILL
BIGGS
BACKER
BAIRD
RASMUSSEN
PHILBIN
GORDON
RICHARDS
FINNY
Done.

Printing Raw List in all uppercase...
NAMETH
SAUER
LAMMONS
MAYNARD
BOOZER
SNELL
ATKINSON
DOCKERNY
EWBANK
ELLIOT
GRANTHAM
HERMAN
HILL
BIGGS
BACKER
BAIRD
RASMUSSEN
PHILBIN
GORDON
RICHARDS
FINNY
Done.
Added: 36	Added To: 0
Added: 34	Added To: 0
Added: 70	Added To: 2
Added: 58	Added To: 2
Added: 9	Added To: 4
Added: 10	Added To: 3
Added: 48	Added To: 3
Added: 31	Added To: 2
Added: 49	Added To: 0
Calling Reallocate...
Added: 99	Added To: 4
Added: 67	Added To: 4
Added: 34	Added To: 2
Added: 91	Added To: 5
Added: 60	Added To: 6
Added: 35	Added To: 0
Added: 13	Added To: 13
Added: 88	Added To: 6
38 36 34 70 58 9 10 48 31 49 99 67 34 91 60 35 13 88 

****************************************************************************
MYARRAYLIST2
****************************************************************************

Calling Reallocate...
Calling Reallocate...
Nameth Sauer Lammons Maynard Boozer Snell Atkinson Dockerny Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Finny 
java.lang.ArrayIndexOutOfBoundsException
Nameth Sauer Lammons Maynard Boozer Snell Atkinson Dockerny Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Finny 
Sauer Lammons Maynard Boozer Snell Atkinson Dockerny Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Finny 
Sauer Lammons Maynard Snell Atkinson Dockerny Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Finny 
Sauer Lammons Maynard Snell Atkinson Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Finny 
Sauer Lammons Maynard Snell Atkinson Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards 

********************************************************
myArrayList3
********************************************************

java.lang.IndexOutOfBoundsException: Index: -2   Size: 18
Sauer Lammons Maynard Snell Atkinson Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards 

Bill Sauer Lammons Maynard Snell Atkinson Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards 

Bill Sauer Lammons Maynard Snell Unitas Atkinson Ewbank Elliot Grantham Herman Hill Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards 

Bill Sauer Lammons Maynard Snell Unitas Atkinson Ewbank Elliot Grantham Herman Hill Smith Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards 

Bill Sauer Lammons Maynard Snell Unitas Atkinson Ewbank Elliot Grantham Herman Hill Smith Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Gill 

java.lang.IndexOutOfBoundsException: Index: 101   Size: 22
Bill Sauer Lammons Maynard Snell Unitas Atkinson Ewbank Elliot Grantham Herman Hill Smith Biggs Biggs Backer Baird Rasmussen Philbin Gordon Richards Gill 

*******************************************************
ArrayList4
*******************************************************

Sam
Namath
Manning
java.lang.ArrayIndexOutOfBoundsException: 50

nameth
sauer
lammons
maynard
boozer
namath
atkinson
dockerny
ewbank
sam
grantham
herman
hill
biggs
backer
baird
rasmussen
philbin
manning
richards
finny

***********************************************
ArrayList5
***********************************************

false
true
true

SAUER
LAMMONS
MAYNARD
BOOZER
NAMATH
ATKINSON
DOCKERNY
EWBANK
SAM
GRANTHAM
HILL
BIGGS
BACKER
BAIRD
RASMUSSEN
PHILBIN
MANNING
RICHARDS
FINNY
*/
