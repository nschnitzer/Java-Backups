//****************************************************
// Nathan Schnitzer
// Deli.java
// 3/5/18
//****************************************************

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Deli 
{
	private JFrame frame;
	private JPanel panel;
	JLabel inputNameLabel;
	final double EXTRA1_PRICE = .99, EXTRA2_PRICE = 1.50, EXTRA3_PRICE = 3.00; //Extra prices
	double[] drinkPrices = {1.50, 2.10, 2.75};
	private JRadioButton sandType1, sandType2, sandType3, sandType4, sandSize1, sandSize2, sandSize3, breadType1, breadType2, breadType3, drinkSizeSmall, drinkSizeMed, drinkSizeLarge;
	private JTextField nameInput;
	private JCheckBox top1, top2, top3, top4, top5, top6, extra1, extra2, extra3, drink;
	private JButton finished, cancel;
	private Receipt receipt = new Receipt();
	Item lettuce, tomato, onions, pickles, salt, oilVinegar, turkey, rBeef, italian, ham;
	Item wheat, white, rye, smallDrink, medDrink, largeDrink, xtraMeat, veg, tofu;
	AllListener bigBrother = new AllListener();
	LinkedList<Item> cart = new LinkedList<Item>();
	
	//Constructor
	public Deli()
	{
		//Instantiate name textfield and label
		nameInput = new JTextField(10);
		inputNameLabel = new JLabel("Name:");
		
		//Instantiate Radio Buttons and Groups
		//Sandwiches type
		sandType1 = new JRadioButton("Turkey");
		sandType1.addActionListener(bigBrother); //Add bigBrotherer to everything else
		sandType1.setToolTipText("Turkey Sandwich. $3.99");
		turkey = new Item(3.99, "Turkey Sandwich");
		sandType2 = new JRadioButton("Italian");
		sandType2.addActionListener(bigBrother);
		sandType2.setToolTipText("Italian Sandwich. $4.50");
		italian = new Item(4.50, "Italian Sandwich");
		sandType3 = new JRadioButton("Roast Beef");
		sandType3.addActionListener(bigBrother);
		sandType3.setToolTipText("Roast Beef Sandwich. $5.50");
		rBeef = new Item(5.50, "Roast Beef Sandwich");
		sandType4 = new JRadioButton("Ham");
		sandType4.addActionListener(bigBrother);
		sandType4.setToolTipText("Ham Sandwich. $4.99");
		ham = new Item(4.99, "Ham Sandwich");
		ButtonGroup sandwiches = new ButtonGroup();
		sandwiches.add(sandType1);
		sandwiches.add(sandType2);
		sandwiches.add(sandType3);
		sandwiches.add(sandType4);
		//Breads
		breadType1 = new JRadioButton("Whole Wheat Bread");
		breadType1.setToolTipText("Whole Wheat Bread");
		breadType1.addActionListener(bigBrother);
		wheat = new Item(0.00, "Whole Wheat Bread");
		breadType2 = new JRadioButton("White Bread");
		breadType2.setToolTipText("White Bread");
		breadType2.addActionListener(bigBrother);
		white = new Item(0.00, "White Bread");
		breadType3 = new JRadioButton("Rye Bread");
		breadType3.setToolTipText("Rye Bread");
		breadType3.addActionListener(bigBrother);
		rye = new Item(0.00, "Rye Bread");
		ButtonGroup breads = new ButtonGroup();
		breads.add(breadType1);
		breads.add(breadType2);
		breads.add(breadType3);
		//Drinks
		drinkSizeSmall = new JRadioButton("Small Drink");
		drinkSizeSmall.setToolTipText("Small Drink. $1.50");
		drinkSizeSmall.addActionListener(bigBrother);
		smallDrink = new Item(drinkPrices[0], "Small Drink");
		drinkSizeMed = new JRadioButton("Medium Drink");
		drinkSizeMed.setToolTipText("Medium Drink. $2.10");
		drinkSizeMed.addActionListener(bigBrother);
		 medDrink = new Item(drinkPrices[1], "Medium Drink");
		drinkSizeLarge = new JRadioButton("Large Button");
		drinkSizeLarge.setToolTipText("Large Drink. $2.75");
		drinkSizeLarge.addActionListener(bigBrother);
		 largeDrink = new Item(drinkPrices[2], "Large Drink");
		ButtonGroup drinks = new ButtonGroup();
		drinks.add(drinkSizeSmall);
		drinks.add(drinkSizeMed);
		drinks.add(drinkSizeLarge);
		
		//CheckBoxes
		//Toppings and make item objects
		top1 = new JCheckBox("Lettuce");
		top1.setToolTipText("Adds Lettuce");
		top1.addActionListener(bigBrother);
		lettuce = new Item(0.00, "Lettuce");
		top2 = new JCheckBox("Tomato");
		top2.setToolTipText("Add Tomato");
		top2.addActionListener(bigBrother);
		tomato = new Item(0.00, "Tomato");
		top3 = new JCheckBox("Oil and Vinegar");
		top3.setToolTipText("Adds Oil and Vinegar");
		top3.addActionListener(bigBrother);
		oilVinegar = new Item(0.00, "Oil and Vinegar");
		top4 = new JCheckBox("Pickles");
		top4.setToolTipText("Adds Pickles");
		top4.addActionListener(bigBrother);
		pickles= new Item(0.00, "Pickles");
		top5 = new JCheckBox("Onions");
		top5.setToolTipText("Adds Onions");
		top5.addActionListener(bigBrother);
		onions = new Item(0.00, "Onions");
		top6 = new JCheckBox("Salt");
		top6.setToolTipText("Adds Salt");
		top6.addActionListener(bigBrother);
		salt = new Item(0.00, "Salt");
		
		//Extras
		extra1 = new JCheckBox("Extra Meat");
		extra1.setToolTipText("Extra Meat on the sandwich. $3.00");
		extra1.addActionListener(bigBrother);
		xtraMeat = new Item(3.00, "Extra Meat");
		extra2 = new JCheckBox("Vegetarian");
		extra2.setToolTipText("Removes all meat for weirdos. $2.50");
		extra2.addActionListener(bigBrother);
		veg = new Item(2.50, "Vegetarian");
		extra3 = new JCheckBox("Tofu");
		extra3.setToolTipText("Replaces meat with tofu. $3.75");
		extra3.addActionListener(bigBrother);
		tofu = new Item(3.75, "Tofu");
		
		
		//Finished and Cancel buttons
		finished = new JButton("Complete Order");
		ConfirmListener buttonListen = new ConfirmListener();
		finished.addActionListener(buttonListen);
		finished.setToolTipText("Completes and submits the order.");
		cancel = new JButton("Cancel Order");
		CancelListener cancelListner = new CancelListener();
		cancel.addActionListener(cancelListner);
		cancel.setToolTipText("Use your brain genius");
		
		panel = new JPanel();
		frame = new JFrame("Sandwich Order");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(90, 800));
		panel.add(inputNameLabel);
		panel.add(nameInput);
		JLabel sandLbl = new JLabel("Sandwich Type\n");
		panel.add(sandLbl);
		panel.add(sandType1);
		panel.add(sandType2);
		panel.add(sandType3);
		panel.add(sandType4);
		JLabel sndTypeLbl = new JLabel("Bread Type:");
		panel.add(sndTypeLbl);
		panel.add(breadType1);
		panel.add(breadType2);
		panel.add(breadType3);
		JLabel topLabel = new JLabel("Toppings:");
		panel.add(topLabel);
		panel.add(top1);
		panel.add(top2);
		panel.add(top3);
		panel.add(top4);
		panel.add(top5);
		panel.add(top6);
		panel.add(new JLabel("Extras"));
		panel.add(extra1);
		panel.add(extra2);
		panel.add(extra3);
		panel.add(new JLabel("Drinks"));
		panel.add(drinkSizeSmall);
		panel.add(drinkSizeMed);
		panel.add(drinkSizeLarge);
		panel.add(finished);
		panel.add(cancel);
		
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	//Create Action Listener for drinks
	private class AllListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			receipt.setName(nameInput.getText());
			if (sandType1.isSelected())
			{
				cart.add(turkey);
			}
			else if (sandType2.isSelected())
			{
				cart.add(italian);
			}
			else if (sandType3.isSelected())
			{
				cart.add(rBeef);
			}
			else if (sandType4.isSelected())
			{
				cart.add(ham);
			}
			
			if (breadType1.isSelected())
			{
				cart.add(wheat);
			}
			else if (breadType2.isSelected())
			{
				cart.add(white);
			}
			else if (breadType3.isSelected())
			{
				cart.add(rye);
			}
			
			if (top1.isSelected())
			{
				cart.add(lettuce);
			}
			if (top2.isSelected())
			{
				cart.add(tomato);
			}
			if (top3.isSelected())
			{
				cart.add(oilVinegar);
			}
			if (top4.isSelected())
			{
				cart.add(pickles);
			}
			if (top5.isSelected())
			{
				cart.add(onions);
			}
			if (top6.isSelected())
			{
				cart.add(salt);
			}
			
			if (extra1.isSelected())
			{
				cart.add(xtraMeat);
			}
			if (extra2.isSelected())
			{
				cart.add(veg);
			}
			if (extra3.isSelected())
			{
				cart.add(tofu);
			}
			if (drinkSizeSmall.isSelected())
			{
				cart.add(smallDrink);
			}
			else if (drinkSizeMed.isSelected())
			{
				cart.add(medDrink);
			}
			else if (drinkSizeLarge.isSelected())
			{
				cart.add(largeDrink);
			}
			receipt.addCart(cart);
				
		}
	}
	
	//Confirm Button Listener
	private class ConfirmListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
				receipt.confirmOrder();
		}
	}
	
	//Cancel Button Listener
	private class CancelListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
				receipt.orderCancelled();
				frame.setVisible(false);
				receipt.frame.setVisible(false);
				JOptionPane.showMessageDialog(null, "Order Canceled");
				new Deli();
		}
	}
			

}
