//**********************************************************
// Nathan Schnitzer
// Item.java
// 3/5/18
//**********************************************************
import java.text.*;

public class Item 
{
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private double price = 0;
	private String name = "";
	
	//Construct Item object
	public Item(double priceIn, String nameIn)
	{
		price = priceIn;
		name = nameIn;
	}
	
	
	//Returns the price
	public double getPrice()
	{
		return price;
	}
	
	//Returns the formatted price
	public String getFormattedPrice()
	{
		return fmt.format(price);
	}
	
	public String getName()
	{
		return name;
	}
	

}
