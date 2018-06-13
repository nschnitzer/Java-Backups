//********************************************************
// Nathan Schnitzer
// StyleGUI.java
// 3/6/18
// Will apply style to text in a gui
//********************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleGUI 
{
	private final int WIDTH = 300, HEIGHT = 100, FONT_SIZE = 36;
	private JLabel saying;
	private JCheckBox bold, italic;
	private JPanel primary;
	
	public StyleGUI()
	{
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font ("Helvetica", Font.PLAIN, FONT_SIZE));
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		
		primary = new JPanel();
		primary.add(saying);
		primary.add(bold);
		primary.add(italic);
		primary.setBackground(Color.cyan);
		primary.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
	
	
	//Return the JPanel
	public JPanel getPanel()
	{
		return primary;
	}
	
	private class StyleListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			int style = Font.PLAIN;
			
			if (bold.isSelected())
			{
				style = Font.BOLD;
			}
			
			if (italic.isSelected())
			{
				style += Font.ITALIC;
			}
			
			saying.setFont(new Font("Helvetica", style, FONT_SIZE));
		}
	}

}
