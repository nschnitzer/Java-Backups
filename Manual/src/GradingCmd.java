//********************************************************
// Nathan Schnitzer
// Grading Quizzes
// 4/21/17
// Computes and grades quizzes
//********************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class GradingCmd 
{

	public static void main(int[] args) 
	{
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getPercentInstance();
		int questions = args[1];
		int[] answers = {96, 45, 74, 22, 100, 60, 44};
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
			key[i] = args[i+1];
		}
		
		while (useLoop.equalsIgnoreCase("y"))
		{
			correctNum = 0;
			//Prompt for the answers to be graded
			System.out.println("Please enter the answers to be graded");
			for (int k = 0; k < questions; k++)
			{
				if (key[k] == answers[k])
					correctNum++;
			}
			
			//Compute the grade of the score
			grade = (correctNum * 1.0) / questions;
			
			//Print out grade
			System.out.println("Grade: " + fmt.format(grade));
			System.out.println("Amount correct: " + correctNum);
			
			//Prompt if user wants to grade another quiz with the same key
			System.out.println("Would you like to grade another quiz with the same key? (y/n)");
			useLoop =  "n"; //scan.next();
		}
		
		System.out.println();
		System.out.println("Done");
		
		scan.close();

	}

}
