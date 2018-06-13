//********************************************************
// Nathan Schnitzer
// Program 5.2
// 3/31/17
// This program will utilize Rational and Comparable interface
//********************************************************

package program5_2;
import java.util.Random;

public class Prog5_2 {

	public static void main(String[] args)
	{
		//Create Random object
		Random gen = new Random();
		
		int compared;
		//Create 2 Rational Objects
		Rational r1 = new Rational(5, 7);
		Rational r2 = new Rational(5, 13);
		
		/*Reduce
		r1.reduce();
		r2.reduce();
		*/
		
		//Compare
		compared = r1.compareTo(r2);
		
		//Print out results
		if (compared == 1)
		{
			System.out.println("Rational 1 is larger");
		}
		else if (compared == 0)
		{
			System.out.println("Rational 1 and 2 are the same");
		}
		else
			System.out.println("Rational 2 is larger");

	}

}
