//*****************************************
//ACSL_1Driver.java
// Nathan Schnitzer
// 12/13/17
// This will be a driver for contesr #1

import java.io.*;
import java.util.*;

public class ACSL_1SDriver 
{

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("src/input"));
		for (int i = 0; i < 5; i++)
		{
			String s = scan.nextLine();
			System.out.println(s);
			StringTokenizer tokenizer = new StringTokenizer(s);
			NinetyNine tester = new NinetyNine(Integer.parseInt(tokenizer.nextToken()));
			
			ArrayList<Integer> hand = new ArrayList<Integer>();
			ArrayList<Integer> queue = new ArrayList<Integer>();
			for (int k = 0; k < 3; k++)
			{
				String adder = tokenizer.nextToken();
				if (adder.equals("K"))
					adder = "13";
				else if (adder.equals("Q"))
					adder = "12";
				else if (adder.equals("J"))
					adder = "11";
				else if (adder.equals("T"))
					adder = "10";
				hand.add(Integer.parseInt(adder));
			}
			
			for (int k = 0; k < 7; k++)
			{
				String adder = tokenizer.nextToken();
				if (adder.equals("K"))
					adder = "13";
				else if (adder.equals("Q"))
					adder = "12";
				else if (adder.equals("J"))
					adder = "11";
				else if (adder.equals("T"))
					adder = "10";
				queue.add(Integer.parseInt(adder));
			}
			
			int onElement = 0;
			while (onElement < 7 && tester.stillPlay())
			{
				
			}
				
		}

	}

}
