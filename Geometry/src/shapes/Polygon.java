//*****************************************************
// Nathan Schnitzer, Ryan Giovanniello, Daniel Reger
// Polygon
// 3/23/17
// Interface Project Driver
//*****************************************************

package shapes;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Polygon 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat dfmt = new DecimalFormat();
		
		//Instantiate 2 Triangle objects
		Triangle tri1 = new Triangle(8, 9, 13);
		Triangle tri2 = new Triangle(8, 16, 14);
		
		//Instantiate 1 IsosTrap Object
		IsosTrap trap = new IsosTrap(14, 20, 7, 7);
		
		//Instantiate 2 Rectangle Objects
		Rectangle rec1 = new Rectangle(15, 36, 39);
		Rectangle rec2 = new Rectangle(16, 28, 40);
		
		//Prints out the results
		
		//Triangles:
		System.out.println("Triangle 1: \t" + tri1);
		System.out.println("Triangle 2: \t" + tri2);

		//Trapezoids:
		System.out.println("Trapezoid 1: \t" + trap);

		//Rectangles:
		System.out.println("Rectangle 1: \t" + rec1);
		System.out.println("Rectangle 2: \t" + rec2);

	}

}
