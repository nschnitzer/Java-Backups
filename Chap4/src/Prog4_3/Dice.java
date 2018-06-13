package Prog4_3;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers;
		
		System.out.println("Please enter the amount of sides on the dice");
		numbers = scan.nextInt();
		
		Die dice = new Die(numbers);
		
		//Roll and return the value of the dice
		dice.roll();
		System.out.println(dice.getFaceValue());
		
		scan.close();

	}

}
