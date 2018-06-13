//************************************************************
// Nathan Schnitzer
// Shopping Cart
// 4/28/17
// This program will represent a shopping cart
//************************************************************

import java.text.NumberFormat;

public class ShoppingCart 
{
	private int itemCount; // total # of items in cart
	private double totalPrice; //total price of items in cart
	private int capacity; //current cart capacity
	Item[] cart;
	
	//Creates an empty shopping cart with a capacity of 5 items
	public ShoppingCart()
	{
		capacity = 5;
		itemCount = 0;
		totalPrice = 0.0;
		cart = new Item[capacity];
	}
	
	//Adds an item to the shopping cart
	public void addToCart(String itemName, double price, int quantity)
	{
		if (itemCount > capacity)
		{
			increaseSize();
		}
		cart[itemCount] = new Item(itemName, price, quantity);
		totalPrice = totalPrice + cart[itemCount].getTotalItemCost();
		itemCount++;
	}
	
	//Returns the contents of the cart
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String contents = "\nShopping Cart";
		contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
		
		for (int i = 0; i < itemCount; i++)
		{
			contents += cart[i].toString() + "\n";
		}
		
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		
		return contents;
	}
	
	//Increases cart capacity by 3
	public void increaseSize()
	{
		Item[] temp = new Item[cart.length + 3];
		for (int p = 0; p < cart.length; p++)
		{
			temp[p] = cart[p];
		}
		
		cart = temp;
		
	}

}
