//*****************************************************
// Nathan Schnitzer, Ryan Giovanniello, Daniel Reger
// Polygon
// 3/23/17
// Interface Project Triangle
//*****************************************************


package shapes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangle 
{
	Scanner scan = new Scanner(System.in);
	int sd1, sd2, sd3;
	String fmt;
	//Instantiate the Decimal Format object
	DecimalFormat dfmt = new DecimalFormat(".##");
	
	public Triangle(int s1, int s2, int hypotenuse)
	{
		if (s1 <= 0 || s2 <= 0 || hypotenuse<= 0)
		{
			fmt = "Values entered less than 0. Invalid input";
		}
		else
		{
			fmt = "Triangle  with a perimeter of " + calcPeri() + " and an area of " + calcArea();
			sd1 = s1;
			sd2 = s2;
			sd3 = hypotenuse;
		}
		if (s1 + s2 <= hypotenuse)
		{
			fmt = "Inputs are invalid. Try again...";
			
		}
		else
		{
			fmt = "Triangle  with a perimeter of " + calcPeri() + " and an area of " + dfmt.format(calcArea());
			sd1 = s1;
			sd2 = s2;
			sd3 = hypotenuse;
		}
		
	}
	
	//Returns the perimeter
	public double calcPeri()
	{
		return sd1 + sd2 + sd3;
	}
	
	//Returns the area
	public double calcArea()
	{
		double p = calcPeri()/2;
		return Math.sqrt(p*(p-sd1)*(p-sd2)*(p-sd3));
	}
	
	public String toString()
	{
		return "Parameters of " + sd1 + ", " + sd2 + ", and " + sd3 + ". " + fmt;
	}

}
