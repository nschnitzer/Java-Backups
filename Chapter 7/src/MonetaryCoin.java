//*******************************************************
// Nathan Schnitzer
// 6/6/17
// Program 7.1
// This will represent a coin's parent
//******************************************************


import java.text.NumberFormat;

public class  MonetaryCoin extends Coin
{
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private double value;
		
	//Constructs an Monetary Coin Object
	public MonetaryCoin(double worth)
	{
		super(); //Call to the parent
		value = worth; //set value
	}

	
	
	//Returns the monetary value as a double
	public double coinVal()
	{
		return value;
	}
	
	
	//Returns a value representing the coin
	public String toString()
	{
		return super.toString() + " and is worth " + fmt.format(coinVal());
	}
	

}
