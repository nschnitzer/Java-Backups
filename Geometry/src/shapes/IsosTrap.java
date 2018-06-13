//*****************************************************
// Nathan Schnitzer, Ryan Giovanniello, Daniel Reger
// Polygon
// 3/23/17
// Interface Project Trapezoid
//*****************************************************

package shapes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class IsosTrap implements CalcMeas
{

	Scanner scan = new Scanner(System.in);
	int b1, b2, length;
	double hTool, height;
	String fmt;
	
	//Instantiate the Decimal Format object
	DecimalFormat dfmt = new DecimalFormat(".##");

	//creates Isosceles Trapezoid object
	public IsosTrap(int bs1, int bs2, int l, int l2)
	{
		//checks if the values are positive
		if (bs1 <= 0 || bs2 <= 0 || l <= 0)
		{
			fmt = "Values entered less than 0. Invalid input";
		}
		else
		{
			b1 = bs1;
			b2 = bs2;
			length = l;
			hTool = (b2 - b1) /2;
			height = Math.sqrt(Math.pow(length, 2) - Math.pow(hTool, 2));
			fmt = "Isosceles Trapezoid with a perimeter of " + calcPeri() + " and an area of " + dfmt.format(calcArea());
		}
		
	}
	
	//Returns the perimeter
	public double calcPeri()
	{
		return b1 + b2 + length + length;
	}
	
	//Returns the area
	public double calcArea()
	{
		return (b2 + b1)/2 * height;
	}
	
	public String toString()
	{
		return "Parameters of " + b1 + " " + b2 + " and " + length + ". " + fmt;
	}

}
