//*********************************************************
// Nathan Schnitzer
// Player.java
// 6/12/17
// Defines a Player Object
//*********************************************************

import java.util.Scanner;
public class Player 
{
	private String name;
	private String team;
	private boolean sameTeam = false, sameName = false, sameNumber = false;
	private int jerseyNumber;
	
	//Prompts for and reads in the player's name, team and jersey #
	public Player()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		name = scan.nextLine();
		System.out.println("Team: ");
		team = scan.nextLine();
		System.out.println("Jersey Number: ");
		jerseyNumber = scan.nextInt();
	}
	
	public boolean equals(Player other)
	{
		if (other.team.equals(team))
			sameTeam = true;
		if (other.name.equals(name))
			sameName = true;
		if (other.jerseyNumber == jerseyNumber)
			sameNumber = true;
		
		if ((sameTeam && sameNumber) || (sameTeam && sameName))
			return true;
		else
			return false;
	}
	
	public boolean objectEquals(Object obj)
	{
		return super.equals(obj);
	}
	
	public String toString()
	{
		return "Player is " + name + " and is number " + jerseyNumber + " on the " + team;
	}

}
