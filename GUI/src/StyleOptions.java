//*******************************************
// Nathan Schnitzer
// StyleOptions.java
// 3/6/18
//*******************************************

import javax.swing.*;

public class StyleOptions 
{

	public static void main(String[] args) 
	{
		JFrame styleFrame = new JFrame("Quote Options");
		styleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StyleGUI gui = new StyleGUI();
		styleFrame.getContentPane().add(gui.getPanel());
		
		styleFrame.pack();
		styleFrame.setVisible(true);

	}

}