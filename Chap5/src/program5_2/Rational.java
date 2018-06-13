//*************************************************
// Nathan Schnitzer
// Rational.java
// 3/30/17
// 

package program5_2;

public class Rational implements Comparable
{
	
	private int numerator, denominator;
	private final double TOLERANCE = 0.0001; //Add!!!
	
	public Rational (int numer, int denom)
	{
		if (denom == 0)
			denom = 1;
		
		//Make numerator "store" the sign
		if (denom < 0)
		{
			numer = numer * -1 ;
			denom = denom * -1;
		}
		
		numerator = numer;
		denominator = denom;
		reduce();
	}
	
	//Returns the numerator value
	public int getNumerator()
	{
		return numerator;
	}
	
	//Returns the denominator value
	public int getDenominator()
	{
		return denominator;
	}
	
	//Returns the reciprocal of the rational number
	public Rational reciprocal()
	{
		return new Rational(denominator, numerator);
	}
	
	//Adds rational number to one passed
	public Rational add(Rational op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;
		
		return new Rational (difference, commonDenominator);
	}
	
	//Multiplies the rational number by a parameter
	public Rational multiply (Rational op2)
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		return new Rational (numer, denom);
	}
	
	//Divides the rational number by the parameter
	public Rational divide(Rational op2)
	{
		return multiply(op2.reciprocal());
	}
	
	//Determines if the rational number is equal to the parameters
	public boolean equals (Rational op2)
	{
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}
	
	//Returns as a string
	public String toString()
	{
		String result;
		if (numerator == 0)
		{
			result = "0";
		}
		else
		{
			if (denominator == 1)
			{
				result = numerator + "";
			}
			else
				result = numerator + "/" + denominator;
		}
		return result;
	}
	
	
	//Will reduce the rational number by a common factor
	public void reduce()
	{
		if (numerator != 0)
		{
			int common = gcd(Math.abs(numerator), denominator);
			
			numerator = numerator / common;
			denominator = denominator / common;
		}
	}
	
	
	//Finds a Greatest common denominator
	public int gcd(int num1, int num2)
	{
		while (num1 != num2)
		{
			if (num1 > num2)
			{
				num1 = num1 - num2;
			}
			else
			{
				num2 = num2 - num1;
			}
		}
		return num1;
	}
	
	//Compares the Rational numbers (if x = -1 parameter is greater) (if x = 1 parameter is less) if (x = 0 the parameter and object is equal)
	public int compareTo(Object obj) {
		Rational r2 = (Rational)obj;
		double rat1 = (double)numerator / denominator;
		double rat2 = (double) r2.getNumerator()/ r2.getDenominator();
		System.out.println("" + rat1 + "    " + rat2);
		
		if (Math.abs(rat1-rat2) > 0.0001)
		{
			return 1;
		}
		else if (Math.abs(rat1 - rat2) > -1*TOLERANCE && Math.abs(rat1-rat2) < TOLERANCE)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

}
