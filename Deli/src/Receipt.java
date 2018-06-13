//************************************************
// Nathan Schnitzer
// receipt.java
// 3/5/18
// Displays a GUI that resembles a receipt of the order being placed
//*************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class Receipt 
{
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	JPanel topPanel, bottomPanel;
	JSplitPane splitPane;
	JTextArea text;
	JLabel label, priceLabel, nameLabel;
	double total = 0.0;
	JFrame frame;
	String name = "";
	ArrayList<Item> items = new ArrayList<Item>();
	JButton confirm = new JButton("Confirm Your Order");
	ButtonListener listener = new ButtonListener();
	Deli deliObj;
	
	//Constructor
	public Receipt()
	{
		//Frame
		frame = new JFrame("Customer receipt");
		frame.setResizable(false);
		splitPane = new JSplitPane();
		frame.setPreferredSize(new Dimension(190, 350));
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setDividerLocation(240);
		
		//Panels
		topPanel = new JPanel();
		topPanel.setMinimumSize(new Dimension(240, 350));
		topPanel.setVisible(true);
		bottomPanel = new JPanel();
		bottomPanel.add(new JLabel("Price: "));
		priceLabel = new JLabel(fmt.format(total));
		bottomPanel.add(priceLabel);
		confirm.setVisible(false);
		confirm.addActionListener(listener);
		
		splitPane.setTopComponent(topPanel);
		splitPane.setBottomComponent(bottomPanel);
		frame.getContentPane().add(splitPane);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	//Adds the cart
	public void addCart(LinkedList<Item> items)
	{
		splitPane.setTopComponent(null);
		JPanel newPanel = new JPanel();
		JLabel newLabel = new JLabel(name + "'s Cart");
		newPanel.add(newLabel);
		total = 0.0;
		while(items.isEmpty() == false)
		{
			JLabel lbl = new JLabel(items.peek().getName() + "\t" + items.peek().getFormattedPrice());
			newPanel.add(lbl);
			total += items.peek().getPrice();
			items.poll();
		}
		splitPane.setTopComponent(newPanel);
		bottomPanel.removeAll();
		priceLabel.setText("Price: " + fmt.format(total));
		bottomPanel.add(priceLabel);
		bottomPanel.add(confirm);
		newPanel.setMinimumSize(new Dimension(300,240));
		
	}
	
	//Sets the Name and changes frame title
	public void setName(String nme)
	{
		name = nme;
		frame.setTitle(nme + "'s Order");
	}
	
	//Makes Confirm Button Visible
	public void confirmOrder()
	{
		confirm.setVisible(true);
		splitPane.getTopComponent().repaint();
	}
	
	//Clears the receipt
	public void orderCancelled()
	{
		total = 0.0;
		splitPane.removeAll();
		topPanel = new JPanel();
		topPanel.setMinimumSize(new Dimension(240, 350));
		topPanel.setVisible(true);
		bottomPanel = new JPanel();
		bottomPanel.add(new JLabel("Price: "));
		priceLabel = new JLabel(fmt.format(total));
		bottomPanel.add(priceLabel);
		splitPane.setTopComponent(topPanel);
		splitPane.setBottomComponent(bottomPanel);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(null, "Order Confirmed");
			System.exit(0);
			
		}
	}

}
