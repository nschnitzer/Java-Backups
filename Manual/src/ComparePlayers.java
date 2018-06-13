//**********************************************************
// Nathan Schnitzer
// ComparePlayers.java
// 6/12/17
// This will contain multiple Players and compare them\
//**********************************************************
public class ComparePlayers 
{

	public static void main(String[] args) 
	{
		//Create 4 Player Objects
		Player guy1 = new Player();
		//guy1 - name: Derek Jeter - #2 - Yankees
		
		Player guy2 = new Player();
		//guy2 - name: Wayne Gretsky - #99 - Oilers
		
		Player guy3 = new Player();
		//guy3 - name: Aaron Judge - #99 - Yankees
		
		Player guy4 = new Player();
		//guy4 - name: Eli Manning - #10 - Giants
		
		//Compare guy 2 and 4
		System.out.println();
		System.out.println("Comparing guy2 and guy 4");
		if (guy2.equals(guy4))
		{
			System.out.println("They are the same player!");
		}
		else
			System.out.println("They are not the same player!");
		
		//Compare guy 2 and 3
		System.out.println();
		System.out.println("Comparing guy2 and guy3");
		if (guy2.equals(guy3))
			{
				System.out.println("They are the same player!");
			}
		else
			System.out.println("They are not the same player!");
				
		//Compare guy 1 and 2
		System.out.println();
		System.out.println("Comparing guy1 and guy 2");
		if (guy1.equals(guy2))
		{
			System.out.println("They are the same player!");
		}
		else
			System.out.println("They are not the same player!");
		
		//Comparing guy2 to itself
		System.out.println();
		System.out.println("Comparing guy2 to itself...");
		if (guy2.equals(guy2))
		{
			System.out.println("They are the same player!");
		}
		else
			System.out.println("They are not the same player!");
		
		//Comparing guy2 to itself using the Object Class' equals
				System.out.println();
				System.out.println("Comparing guy2 to itself using Object's equals method...");
				if ()
				{
					System.out.println("They are the same player!");
				}
				else
					System.out.println("They are not the same player!");

	}

}
