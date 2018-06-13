//***********************************************************************
// Nathan Schnitzer
// Shop.java Shopping Cart Program
// 5/16/17
// This will use the Item class and keep a shopping cart
//***********************************************************************

import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class Shop 
{

	public static void main(String[] args) 
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		ArrayList<Item> cart = new ArrayList();
		Item item;
		String itemName;
		double itemPrice, finalPrice = 0;
		int quantity;
		
		Scanner scan = new Scanner(System.in);
		
		String keepShopping = "y";
		
		do 
		{
			System.out.println("Enter the name of the item:");
			itemName = scan.next();
			
			System.out.println("Enter the unit price:");
			itemPrice = scan.nextDouble();
			
			System.out.println("Enter the quantity:");
			quantity = scan.nextInt();
			
			//Create a new item
			item = new Item(itemName, itemPrice, quantity);
			
			//Adds item to the cart
			cart.add(item);
			System.out.println();
			System.out.println();
			
		
			//Prints out the arrayList
			System.out.println("Current Cart:");
			double totalPrice = 0;
			for (int i = 0; i < cart.size(); i++)
			{
				System.out.println(cart.get(i));
				totalPrice = totalPrice + cart.get(i).getTotalItemCost();
				finalPrice += cart.get(i).getTotalItemCost();
			}
			System.out.println();
			System.out.println("Total: " + fmt.format(totalPrice));
			System.out.println();
			
			
			System.out.println("Continue Shopping (y/n)?");
			keepShopping = scan.next();
		}
		while (keepShopping.equals("y"));
		
		System.out.println();
		System.out.println("Final total: " + fmt.format(finalPrice));

	}

}
