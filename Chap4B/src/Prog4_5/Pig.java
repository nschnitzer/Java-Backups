//*****************************************************
// Nathan Schnitzer
// Pig.java 4.5
// 2/7/17
// This program will be able to play Pig with the given requirements
//*****************************************************

package Prog4_5;
import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PairOfDice player = new PairOfDice();
		PairOfDice computer = new PairOfDice();
		String response;
		String response2 = "y";
		
		String result;
		if (player.getTurn())
			System.out.println("y");
		
		System.out.println("Would you like to roll? Last Round Score: " + player.getRoundScore() + " Total Score: " + player.getTotalScore());
		response = scan.nextLine();
		
		while (player.pigCompare(computer) == false && response.equalsIgnoreCase("y"))
		{
			response2 = "y";
			player.updateTurn();
			while (player.getTurn() && response2.equalsIgnoreCase("y"))
			{
				System.out.println("Player:");
				player.updateRound(player.pigGame());
				if (player.getTurn())
				{
					System.out.println("Roll again? \t Current Round Score: " + player.getRoundScore());
					System.out.println();
					response2 = scan.nextLine();
				}
			}
			player.endRound();
				
				computer.updateTurn();
				System.out.println("Computer:");
				while (computer.getTurn() && computer.getRoundScore() < 15)
				{
					computer.updateRound(computer.pigGame());
				}
				computer.endRound();
				
				System.out.println();
				System.out.println("Your round score: " + player.getRoundScore());
				System.out.println("Your total score: " + player.getTotalScore());
				System.out.println("Computer round score: " + computer.getRoundScore());
				System.out.println("Computer total score: " + computer.getTotalScore());
				System.out.println();
			
			
			System.out.println("Roll?");
			response = scan.nextLine();
			
		}
		
		//Announce the winner
		player.pigCompare(computer);

	}

}
