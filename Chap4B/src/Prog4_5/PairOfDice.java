//*****************************************************
// Nathan Schnitzer
// PairOfDice.java 4.5
// 2/7/17
// This program will be able to play Pig with the given requirements
//*****************************************************

package Prog4_5;

import java.util.Random;

public class PairOfDice 
{
	//Declare variables
	private final int MIN_FACES = 4;
	private final int ROUND_LIMIT = 20;
	private final int END_GAME = 100;	private int numFaces, roundScore = 0, endScore = 0;

	private static Random gen = new Random();
	private int faceValue;
	private boolean playerTurn = false, winner = false;
	private int lastValue, curValue, count = 0, roll1, roll2;
	private int turnScore = 0;
	
	//Create Die with default sides
	public PairOfDice ()
	{
		numFaces = 6;
		faceValue = 1;
	}
	
	//Create Die object with certain amount of sides
	public PairOfDice (int faces)
	{
		
		if (faces < MIN_FACES)
			numFaces = 6;
		else
			numFaces = faces;
		
		faceValue = 1;
	}
	
	//Roll method
	public int roll()
	{
		faceValue = gen.nextInt(numFaces) + 1;
		return faceValue;
	}
	
	//Create method that returns the value
	public int getFaceValue()
	{
		return faceValue;
	}
	
	//Updates round Score after 1 turn
	public void updateRound(int turn)
	{
		roundScore = roundScore + pigGame();
	}
	
	public int pigGame() //Will play Pig and return the values for 1 turn
	{
		lastValue = curValue;
		roll1 = roll();
		roll2 = roll();
		curValue = roll1 + roll2;
		turnScore = curValue;
		if (roll1 == 1 || roll2 == 1)
		{
			if (roll1 == 1 && roll2 == 1)
			{
				System.out.println("Back To Zero");
				roundScore = 0;
				endScore = 0;
				turnScore = 0;
				endRound();
			}
			else
			{
			
			System.out.println("Round Score lost");
			roundScore = 0;
			turnScore = 0;
			endRound();
			}
		}
		else
		{
		if (getRoundScore() + turnScore >= 20)
		{
			roundScore = 20;
			endRound();
			System.out.println("Round score Limit reached");
		}
		}
		return turnScore;
	}
	
	//Ends the round and updates the total score
	public void endRound()
	{
		endScore = endScore + getRoundScore();
		roundScore = 0;
		playerTurn = false;
	}
	
	//Returns a boolean representing who's turn
	public boolean getTurn()
	{
		return playerTurn;
	}
	
	//returns the current round score
	public int getRoundScore()
	{
		return roundScore;
	}

	//Returns the overall score
	public int getTotalScore()
	{
		return endScore;
	}
	
	//Changes the playerTurn when called
	public void updateTurn()
	{
		playerTurn = !(playerTurn);
	}
	
	
	public boolean pigCompare(PairOfDice d2) //Will compare the length of the time of the 2 die
	{
		int d1Value = getTotalScore();
		int d2Value = d2.getTotalScore();
		
		//Compare the length
		if (d1Value >= 100)
		{
			System.out.println("Winner: Dice 1! \t " + d1Value + ":" + d2Value);
			return true;
		}
		else if (d1Value >= 100 && d2Value >= 100)
		{
			System.out.println("Tie \t " + d1Value + ":" + d2Value);
			return true;
		}
		else if (d2Value >= 100)
		{
			System.out.println("Winner: Dice 2! \t " + d1Value + ":" + d2Value);
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
