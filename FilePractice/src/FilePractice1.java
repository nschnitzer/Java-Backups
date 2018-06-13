//**********************************************
// Nathan Schnitzer
// FilePractice1.java
// 12/13/17
// This will demonstrate importing a file using scanner
//**********************************************

import java.io.*;
import java.util.*;

public class FilePractice1 
{

	public static void main(String[] args) throws IOException
	{
		int sum = 0, count = 0;
		Scanner scan = new Scanner(new File("src/FilePractice2.txt"));
			while (scan.hasNext())
			{
				String s = scan.nextLine();
				System.out.println(s);
				StringTokenizer tokenizer = new StringTokenizer(s);
				String token = "";
				while (tokenizer.hasMoreTokens())
				{
					token = tokenizer.nextToken();
					sum = sum + Integer.parseInt(token);
					count++;
				}
			}
		System.out.println("Average is " + sum/count);
		scan.close();
	}

}
