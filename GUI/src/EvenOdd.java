import javax.swing.*;

//***************************************************
// Nathan Schnitzer
// 2/15/18
// EvenOdd.java
// Will use a GUI to determine if num is even or odd
//***************************************************

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		String numStr, result;
		int num, again;
		
		do
		{
			numStr = JOptionPane.showInputDialog("Enter an Integer:");
			num = Integer.parseInt(numStr);
			result = "That Number is " + ((num % 2 == 0)?"even" : "odd");
			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Do another?");
		}
		while (again == JOptionPane.YES_OPTION);
		
		//End
		

	}

}
