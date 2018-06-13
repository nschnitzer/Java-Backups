//********************************************************
// Nathan Schnitzer
// Grading Quizzes
// 4/21/17
// Computes and grades quizzes
//********************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Grading 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getPercentInstance();
		int questions = 0;
		String useLoop = "y";
		int correctNum = 0;
		double grade;
		
		//Prompt for the amount of questions
		System.out.println("Please enter the amount of questions to be graded");
		questions = scan.nextInt();
		
		//Set up the arrays with the amount of questions
		int[] key = new int[questions];
		
		//Prompt for the answer key
		System.out.println("Please enter the answer key...");
		for (int i = 0; i < questions; i++)
		{
			key[i] = scan.nextInt();
		}
		
		while (useLoop.equalsIgnoreCase("y"))
		{
			correctNum = 0;
			//Prompt for the answers to be graded
			System.out.println("Please enter the answers to be graded");
			for (int k = 0; k < questions; k++)
			{
				if (key[k] == scan.nextInt())
					correctNum++;
			}
			
			//Compute the grade of the score
			grade = (correctNum * 1.0) / questions;
			
			//Print out grade
			System.out.println("Grade: " + fmt.format(grade));
			System.out.println("Amount correct: " + correctNum);
			
			//Prompt if user wants to grade another quiz with the same key
			System.out.println("Would you like to grade another quiz with the same key? (y/n)");
			useLoop = scan.next();
		}
		
		System.out.println();
		System.out.println("Done");
		
		scan.close();

	}

}
