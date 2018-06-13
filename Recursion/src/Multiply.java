//***********************************************************
// Nathan Schnitzer
// Multiply.java
// 9/7/17
// This will emulate a factorial
//***********************************************************

public class Multiply 
{
	public static int factorial(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
	
	public static int factTailRec(int n)
	{
		if (n == 0)
			return 1;
		else
			return factorial_i(n, 1);
	}
	
	//Uses tail recursion
	public static int factorial_i(int current, int sum)
	{
		if (current == 1)
			return sum;
		else
			return factorial_i(current - 1, sum * current);
	}

}
