//*************************************************
// Nathan Schnitzer
// card.java 4.6
// 2/15/17
// This program will generate playing cards
//*************************************************

package Prog4_6;
import java.util.Random;

public class card {
	//Declare Variables
	Random gen = new Random();
	private String strValue;
	private final int MAX_CARDS = 20, VALUE_LIMIT = 13;
	private int random, cardValue, valueCount = 1, random2;
	private int numDealt = 0;
	
	
	//Constructor
	public card()
	{
		
	}
	
	//Gens int value for the suit
	public int getSuitVal()
	{
		random2 = gen.nextInt(4) + 1;
		return random2;
	}
	
	//Gen int value for the card
	private int genCard()
	{
		random = gen.nextInt(13) + 1;
		return random;
	}
	
	//Keeps track of the amount of cards dealt
	public void dealt()
	{
		numDealt++;
	}
	
	//Returns number of cards dealt without incrementing
	public int getDealt()
	{
		return numDealt;
	}
	
	//Deal the suit for the card generated
	public String suitType()
	{
		int suitValue = getSuitVal();
		if (suitValue == 1)
		{
			suitValue = ""
		}
	}
	
	//Deals a value for the int value generated
	public String dealCard()
	{
		valueCount = 0;
		
		cardValue = genCard();
		while (cardValue != valueCount && valueCount <= VALUE_LIMIT)
		{
			valueCount++;
		}
		if (valueCount > 10)
		{
			if (valueCount == 11)
			{
				strValue = "Jack";
			}
			else if (valueCount == 12)
			{
				strValue = "Queen";
			}
			else
			{
				strValue = "King";
			}
		}
		else if (valueCount == 1)
		{
			strValue = "Ace";
		}
		else
		{
			strValue = Integer.toString(valueCount);
		}
		
		//Call to dealt() to increment the count of cards dealt
		dealt();
		
		//Returns the String
		return strValue;
	}
	
	
	//Returns a formatted sentence with the value and which card it was
	public String fmtCard()
	{
		return ("Card " + (getDealt()  + 1) + ": \t " + dealCard());
	}

}
