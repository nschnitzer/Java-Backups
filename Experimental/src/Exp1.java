//*************************************************************************
// Nathan Schnitzer
// Exp.java
// 9/15/17
// This program will be the driver for the Student class that utilizes the Linked List data structure
//*************************************************************************

import java.math.BigInteger;
import java.util.LinkedList;

public class Exp1 
{

	public static void main(String[] args) 
	{
		/*
		LinkedList<Student> listCSA = new LinkedList<Student>();
		Student s1 = new Student("Namath", "123 Elm Street", "Joe", 3.5, 10);
		Student s2 = new Student("Orton", "14 Viperville Drive", "Randy", 3.1, 9);
		
		listCSA.add(s1);
		listCSA.add(s2);
		
		System.out.println(listCSA.get(0));
		//System.out.println(listCSA.get(0).getGPA());
		System.out.println();
		System.out.println(listCSA.get(1));
		
		listCSA.remove(0);
		*/
		
		BigInteger bigInteger = new BigInteger("41242467608");
		System.out.println(bigInteger.hashCode());
		
		String str = "We don't want you to know when it starts . . .";
		System.out.println(str.hashCode());
		
		System.out.println(bigInteger.mod(new BigInteger("192253449")));

	}

}
