//***********************************************
// Nathan Schnitzer
// QuoteGUI.java
// 3/5/18
//***********************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuoteGUI 
{
	private final int WIDTH = 300, HEIGHT = 100;
	private JPanel primary;
	private JLabel quote;
	private JRadioButton comedy, philosophy, carpenter;
	private String comedyQuote = "Take my wife, please.";
	private String philosophyQuote = "I think, therefore I am";
	private String carpenterQuote = "Measure Twice, Cut Once";
	
	public QuoteGUI()
	{
		quote = new JLabel(comedyQuote);
		quote.setFont(new Font("Helvetica", Font.BOLD, 24));
		
		comedy = new JRadioButton("Comedy", true);
		comedy.setBackground(Color.green);
		philosophy = new JRadioButton("Philosophy");
		philosophy.setBackground(Color.green);
		carpenter = new JRadioButton("Carpenter");
		carpenter.setBackground(Color.green);
		
		ButtonGroup group = new ButtonGroup();
		group.add(comedy);
		group.add(philosophy);
		group.add(carpenter);
		
		QuoteListener listener = new QuoteListener();
		comedy.addActionListener(listener);
		philosophy.addActionListener(listener);
		carpenter.addActionListener(listener);
		
		primary= new JPanel();
		primary.add(quote);
		primary.add(comedy);
		primary.add(philosophy);
		primary.add(carpenter);
		primary.setBackground(Color.green);
		primary.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
	
	public JPanel getPanel()
	{
		return primary;
	}
	
	private class QuoteListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource();
			
			if (source == comedy)
				quote.setText(comedyQuote);
			else if (source == philosophy)
			{
				quote.setText(philosophyQuote);
			}
			else
				quote.setText(carpenterQuote);
		}
	}

}
