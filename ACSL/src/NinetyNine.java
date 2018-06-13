//*************************************************************
// Nathan Schnitzer
// NinetyNine.java
// 12/13/17
// ACSL 2017=2018 Contest 1
//*************************************************************

public class NinetyNine 
{
	public int score;
	public int turns = 0;
	public boolean stillPlay = true;
	
	//Constructs an object
	public NinetyNine()
	{
		score = 0;
	}
	
	//Constructs an object
	public NinetyNine(int startScore)
	{
		score = startScore;
	}
	
	//Plays a turn with a card from 0-9
	public void play(int cardValue)
	{
		if (stillPlay())
		{
			turns++;
			if (cardValue == 10)
				score = score - 10;
			else if (cardValue != 9)
			{
				score = score + cardValue;
				if (score >= 100)
					winner(score, turns);
			}
				
		}
	}
	
	//Plays all other cards
	public void player(int card)
	{
		if (card == 14)
		{
			if (getScore() + 14 >= 100)
				play(1);
			else
				play(14);
		}
		else if (card == '9')
			return;
		else
			play(Character.getNumericValue(card));
	}
	
	public int getScore()
	{
		return score;
	}
	
	public boolean stillPlay()
	{
		return stillPlay();
	}
	
	public void winner(int score, int turnNum)
	{
		stillPlay = false;
		String winner = "";
		
		if (turnNum % 2 == 1)
			winner = "dealer";
		else
			winner = "player";
	}
}
