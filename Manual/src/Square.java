//********************************************************
// Nathan Schnitzer
// Square.java
// 5/31/17
// This program will define a square and read in a matrix and compute sum, diagonal and if its magic?
//********************************************************

import java.util.Scanner;

public class Square 
{
	int[][] square;
	
	//*******************************
	//Create new square of given size
	//*******************************
	public Square(int size)
	{
		square = new int[size][size];
	}
	
	//****************************
	// Returns the sum of the given row
	//****************************
	public int sumRow(int row)
	{
		int sum = 0;
		for (int i = 0; i < square[row].length; i++)
			sum = sum + square[row][i];
		
		return sum;
	}
	
	//*******************************
	// Returns the sum of the values in the given column
	//*******************************
	public int sumCol(int col)
	{
		int sum = 0;
		for (int i = 0; i < square.length; i++)
		sum = sum + square[i][col];
		
		return sum;
		
	}
	
	
	//***********************************
	// Returns the sum of the values in the main diagonal L -> R
	//***********************************
	public int sumMainDiag()
	{
		int sum = 0;
		for (int i = 0; i < square.length; i++)
		{
			sum += square[i][i];
		}
		return sum;
		
	}
	//*********************************
	//Returns the sum of the other diagonal R -> L
	//*********************************
	public int sumOtherDiag()
	{
		int sum = 0;
		for (int k = square.length-1; k >= 0; k++)
		{
			sum += square[k][k];
		}
		
		return sum;
	}
	
	//**********************************************
	//Returns true if the square is magic and false if not
	//**********************************************


}
