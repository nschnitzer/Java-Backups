//************************************************************************
// Nathan Schnitzer
// Item.java
// 4/28/17
// Represents an item in the shopping cart
//************************************************************************

import java.text.NumberFormat;

public class Item 
{
	
	private String name;
	private double price;
	private int quantity;
	
	//Create new item with given attributes
	public Item (String itemName, double itemPrice, int numPurchased)
	{
		name = itemName;
		price = itemPrice;
		quantity = numPurchased;
	}
	
	//return string with information about the item
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price* quantity));
	}
	
	//Returns unit price of the item
	public double getPrice()
	{
		return price;
	}
	
	//Returns the name of the object
	public String getName()
	{
		return name;
	}
	
	//Returns the quantity of the item
	public int getQuantity()
	{
		return quantity;
	}
	
	//Returns the total item cost
	public double getTotalItemCost()
	{
		return price * quantity;
	}

}
