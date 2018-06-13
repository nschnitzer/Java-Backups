package Prog4_3;

import java.util.Random;

public class Die 
{
	//Declare variables
	private final int MIN_FACES = 4;
	private static Random gen = new Random();
	private int numFaces;
	private int faceValue;
	
	//Create Die with default sides
	public Die ()
	{
		numFaces = 6;
		faceValue = 1;
	}
	
	//Create Die object with certain amount of sides
	public Die (int faces)
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
	
}
