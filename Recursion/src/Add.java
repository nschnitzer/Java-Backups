//**************************************************
// Nathan Schnitzer
// Add.java
// 9/7/17
// This will add sum of first n integers
//**************************************************

public class Add 
{
	public static int sum(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return n + sum(n-1);
		}
	}

}
