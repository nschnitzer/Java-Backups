//*****************************************
// Nathan Schnitzer
// KelvinGUI.java
// 2.23.18
//*****************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class KelvinGUI 
{
	private final int WIDTH = 210, HEIGHT = 140;
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel, outputLabel, resultLabel;
	private JLabel secondTemp;
	private JLabel secondResult;
	private JRadioButton fahrenheitButton, kelvinButton;
	private JTextField kelvin;
	private JCheckBox showAll;
	
	//Constructs the gui
	public KelvinGUI()
	{
		//Configure the frame
		frame = new JFrame("Temperature Conversion");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Configure the radio buttons and check boxes
		fahrenheitButton = new JRadioButton("Fahrenheit");
		kelvinButton = new JRadioButton("Kelvin", true);
		ButtonGroup group = new ButtonGroup();
		group.add(fahrenheitButton);
		group.add(kelvinButton);
		showAll = new JCheckBox("Show All Conversions");
		
		//Configure the labels
		inputLabel = new JLabel("Enter Temperature Here");
		outputLabel = new JLabel("Temperature in Celsius");
		secondTemp = new JLabel();
		secondResult = new JLabel();
		resultLabel = new JLabel("---");
		
		//Configure the TextField and listeners
		kelvin = new JTextField(5);
		TempListener listener = new TempListener();
		kelvin.addActionListener(listener);
		fahrenheitButton.addActionListener(listener);
		kelvinButton.addActionListener(listener);
		showAll.addActionListener(listener);
		
		
		//Configure the panel
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		panel.setBackground(Color.cyan);
		panel.add(inputLabel);
		panel.add(kelvin);
		panel.add(kelvinButton);
		panel.add(fahrenheitButton);
		panel.add(showAll);
		panel.add(outputLabel);
		panel.add(resultLabel);
		panel.add(secondTemp);
		panel.add(secondResult);
		frame.getContentPane().add(panel);
		
	}
	
	//Begins display
	public void display()
	{
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public int inputTemp;
	private class TempListener implements ActionListener
	{
		private DecimalFormat fmt = new DecimalFormat("#.###");
		public void actionPerformed(ActionEvent event)
		{
			
			double celsiusTemp = 0, otherTemp = 0;
			String text = kelvin.getText();
			inputTemp = Integer.parseInt(text);
			panel.remove(secondTemp); //Removes the old result
			panel.remove(secondResult); //Removes the old result
			panel.repaint();
			if (showAll.isSelected())
			{
				if (kelvinButton.isSelected())
				{
					
					secondTemp = new JLabel("Temperature in Fahrenheit"); 
					secondResult = new JLabel("---"); 
					panel.add(secondTemp); //Adds new result
					panel.add(secondResult); //Adds new result
					
					celsiusTemp = inputTemp - 273.15;
					otherTemp = ((celsiusTemp + 32) * 9.0/5);
					resultLabel.setText(fmt.format(celsiusTemp));
					secondResult.setText(fmt.format(otherTemp));
				}
				else
				{
					panel.remove(secondTemp); //Removes the old result
					panel.remove(secondResult); //Removes the old result
					secondTemp = new JLabel("Temperature in Kelvin");
					secondResult = new JLabel("--");
					panel.add(secondTemp); //Adds new result
					panel.add(secondResult); //Adds new result
					
					celsiusTemp = (inputTemp - 32) * 5.0 / 9;
					otherTemp = celsiusTemp - 273.15;
					resultLabel.setText(fmt.format(celsiusTemp));
					secondResult.setText(fmt.format(otherTemp));
				}
				
			}
			else
			{
				if (kelvinButton.isSelected())
				{
					celsiusTemp = inputTemp - 273.15;
					resultLabel.setText(fmt.format(celsiusTemp));
				}
				else
				{
					celsiusTemp = (inputTemp - 32) * 5.0 / 9;
					resultLabel.setText(fmt.format(celsiusTemp));
				}
			}
		}
	}
	

}
