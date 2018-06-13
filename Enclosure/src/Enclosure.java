//*************************************************
// Nathan Schnitzer
// Enclosure.java ACSL Contest #2
// 1/17/18
//*************************************************

import java.util.*;
import java.io.*;

public class Enclosure 
{

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("src/Inputs.txt"));
		
		
		//while (scan.hasNextLine())
		{
			String input = scan.nextLine();
			ArrayList<Symbol> stk = new ArrayList<Symbol>();
			
			//Put all items into the stack
			for (int i= 0; i < input.length(); i++)
			{
				stk.add(new Symbol(i, input.charAt(i)));
			}
			boolean para1 = false, para2 = false, bracket1 = false, bracket2 = false;
			
			//Finds which one is missing
		
			for (int k = 0; k < stk.size(); k++)
			{
				if (stk.get(k).getSymbol() == '(')
					para1 = true;
				else if (stk.get(k).getSymbol() == ')')
					para2 = true;
				else if (stk.get(k).getSymbol() == '[')
					bracket1 = true;
				else if (stk.get(k).getSymbol() == ']')
					bracket2 = true;
			}
			System.out.println(para1);
			System.out.println(para2);
			System.out.println(bracket1);
			System.out.println(bracket2);
			System.out.println();
			
			if (para1 == false)
			{
				//Set range
			}
			
			for (int i = 0; i < stk.size(); i++)
			{
				System.out.println(stk.get(i).toString());
			}
		}

	}

}
