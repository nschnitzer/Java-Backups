//*********************************************
// Nathan Schnitzer
// StackDriver.java
// 1/16/18
// This will run a stack
//*********************************************

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class StackDriver 
{

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("Abe");
		stack.push("Bill");
		stack.push("Cat");
		stack.push("Dog");
		
		System.out.println(stack.peek());
		
		while (!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
