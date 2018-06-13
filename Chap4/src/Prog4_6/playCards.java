//*****************************************************
// Nathan  Schnitzer
// playCards.java 4.6
// 2/15/17
// This program will generate 20 random playing cards
//******************************************************

package Prog4_6;

public class playCards {

	public static void main(String[] args) {
		card play = new card();
		final int LIMIT = 20;
		
		
		while (play.getDealt() < LIMIT)
		{
			System.out.println(play.fmtCard());
		}

	}

}
