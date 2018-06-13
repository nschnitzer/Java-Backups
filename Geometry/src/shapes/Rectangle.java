//*****************************************************
// Nathan Schnitzer, Ryan Giovanniello, Daniel Reger
// Polygon
// 3/23/17
// Interface Project Rectangle
//*****************************************************

package shapes;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Rectangle implements CalcMeas
{
	int side1, side2, dgn;
	String fmt;
	Scanner scan = new Scanner(System.in);
	
	//Instantiate the Decimal Format object
	DecimalFormat dfmt = new DecimalFormat(".##");
	
	//Creates Rectangle object
	public Rectangle(int s1, int s2, int diagonal)
	{
		//checks if the values are positive
		if (s1 <= 0 || s2 <= 0 || diagonal <= 0)
		{
			fmt = "Values entered less than 0. Invalid input";
		}
		else
		{
			side1 = s1;
			side2 = s2;
			dgn = diagonal;
			fmt = "Rectangle with a perimeter of " + calcPeri() + " and an area of " + dfmt.format(calcArea());
		}
	
	
	//Checks if the diagonal is the proper length
	if (Math.pow(s1, 2) + Math.pow(s2, 2) != Math.pow(diagonal, 2))
	{
		fmt = "Values entered do not form a rectangle. Try again...";
	}
	side1 = s1;
	side2 = s2;
	dgn = diagonal;
	}
	
	//Calculates the perimeter
	public double calcPeri()
	{
		return side1 + side1 + side2 + side2;
	}
		
	//Calculates the area
	public double calcArea()
	{
		return side1 * side2;
	}



//Returns a string of the Rectangle Object
public String toString()
{
	return "Parameters of " + side1 + ", " + side2 + ", and " + dgn + ". " + fmt;
}
}


