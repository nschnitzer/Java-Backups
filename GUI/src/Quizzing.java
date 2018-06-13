//**************************************************************
// Nathan Schnitzer
// Quizzing.java
// 2/16/18
// This program will create a quiz in a gui form
//**************************************************************

import javax.swing.*;
import java.text.NumberFormat;

public class Quizzing 
{

	public static void main(String[] args) 
	{
		NumberFormat fmt = NumberFormat.getPercentInstance();
		
		String response, result;
		boolean resultBool;
		/*
		String[] questions = {"Where is the Blue House located?", "Where were the 1980 Winter Olympics?", "Where does the mayor of New York City live?",
							  "Who broke the enigma code?", "What is the theory that explains the force of Gravity?", "Who was the 3rd President of the United States?",
							  "Who was the first man to walk on the moon?", "Who is the President of Alphabet Inc?", "Who is the best quarterback of all time?",
							  "Who is the Rubik's Cube Club advisor?"};
		
		String[] correctAnswers = {"South Korea", "Lake Placid", "Gracie Mansion", "Alan Turing", "Theory of Relativity", "Thomas Jefferson", "Neil Armstrong",
								   "Sergey Brin", "Joe Namath", "Mr Fredricks"};
		
		int num, again, count = 0, rightCount = 0;
		
		do
		{
			response = JOptionPane.showInputDialog(questions[count]);
			result = ((response.equalsIgnoreCase(correctAnswers[count]))?"Correct" : "Incorrect");
			resultBool = ((response.equalsIgnoreCase(correctAnswers[count]))? true : false);
			if (resultBool)
				rightCount++;
			
			
			JOptionPane.showMessageDialog(null, result);
			
			again = JOptionPane.showConfirmDialog(null, "Next Question?");
			count++;
		}
		while (again == JOptionPane.YES_OPTION);
		
		JOptionPane.showMessageDialog(null, "Your score is " + fmt.format((rightCount * 1.0) / count));
		*/
		
		//Begin Next Quiz (T/F, MC and short answer
		//JOptionPane.showMessageDialog(null, "Starting Next Quiz...");
		String[] mcQuestions = {"Who wrote Hamlet?", "Who is the best quarterback of all time?", "What NHL goalie has the most wins, shutouts and games played?"};
		String[] mc1 = {"Shakespeare", "Dr Seuss", "JK Rowling", "Logan Daniels"};
		String[] mc2 = {"Eli Manning", "Tom Brady", "Joe Namath", "Joe Montana"};
		String[] mc3 = {"Patrick Roy", "Glenn Hall", "Henrik Lundqvist", "Martin Brodeur"};
		String[][] mc = {mc1, mc2, mc3};
		String[] correctMCAnswers = {"Shakespeare", "Joe Namath", "Martin Brodeur"};
		String[] tfQuestions = {"Wayne Gretsky wore number 99.", "John Adams was the third president of the US.", "AC stands for Direct Current."};
		boolean[] tfAnswers = {true, false, false};
		Object[][] answerChoices = {mc1, mc2, mc3};
		String[] saQuestions = {"Where does the British Royal Family live?", "How many home runs has Babe Ruth hit?", "Where were the 1972 Olympics?"};
		String[] saAnswers = {"Buckingham Palace", "714", "Munich"};
		
		int num, count = 0, rightCount = 0;
		boolean again = true;
		
		///Begin do while
		do
		{
			if (count < 3) //Multiple Choice
			{
				if(count == 0)
				{
					JOptionPane.showMessageDialog(null, "Beginning the Multiple Choice Questions...");
				}
			response = (String) JOptionPane.showInputDialog(null, mcQuestions[count], null, JOptionPane.QUESTION_MESSAGE, null, answerChoices[count], mc[count]);
			result = ((response.equalsIgnoreCase(correctMCAnswers[count]))?"Correct" : "Incorrect");
			resultBool = ((response.equalsIgnoreCase(correctMCAnswers[count]))? true : false);
			if (resultBool)
			{
				rightCount++;
			}
			
			JOptionPane.showMessageDialog(null, result);
			}
			else if (count < 6) //True or False
			{
				if (count == 3)
					JOptionPane.showMessageDialog(null, "Starting True or False Questions...");
				response = JOptionPane.showInputDialog(null, tfQuestions[count - 3]);
				result = ((response.equalsIgnoreCase(Boolean.toString(tfAnswers[count - 3])))? "Correct" : "Incorrect");
				resultBool = ((response.equalsIgnoreCase(Boolean.toString(tfAnswers[count -3])))? true : false);
				if (resultBool)
				{
					rightCount++;
				}
				JOptionPane.showMessageDialog(null, result);
			}
			else
			{
				if (count == 6)
				{
					JOptionPane.showMessageDialog(null, "Starting Short Answer Questions...");
				}
				response = JOptionPane.showInputDialog(null, saQuestions[count - 6]);
				result = ((response.equalsIgnoreCase(saAnswers[count - 6]))? "Correct" : "Incorrect");
				resultBool = ((response.equalsIgnoreCase(saAnswers[count - 6]))? true : false);
				if (resultBool)
					rightCount++;
				
				JOptionPane.showMessageDialog(null, result);
			}
			
			if (count  == 8)
				again = false;
			count++;
		}
		while (again);
		
		//Calculate score
		JOptionPane.showMessageDialog(null, "Your Score is: " + fmt.format((rightCount * 1.0) / count));
		
		

	}

}
