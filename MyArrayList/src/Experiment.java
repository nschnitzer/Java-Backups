//******************************************
// Nathan Schnitzer
// Experiment.java
// 11/16/17
//******************************************

import java.util.*;

public class Experiment 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(); //Raw ArrayList
		list.add("Jim");
		list.add("Sam");
		list.add("Paul");
		list.add("Kelsey");
		
		for (int i = 0; i < list.size(); i++)
		{
			//System.out.println(((String)list.get(i)).toUpperCase()); //get(i) returns a generic type... must cast to string to use string method
			System.out.println(list.get(i).toUpperCase());
		}

	}

}
