//*******************************************
// Nathan Schnitzer
// QuoteOptions.java
// 3/6/18
//*******************************************

import javax.swing.*;

public class QuoteOptions 
{

	public static void main(String[] args) 
	{
		JFrame quoteFrame = new JFrame("Quote Options");
		quoteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		QuoteGUI gui = new QuoteGUI();
		quoteFrame.getContentPane().add(gui.getPanel());
		
		quoteFrame.pack();
		quoteFrame.setVisible(true);

	}

}
