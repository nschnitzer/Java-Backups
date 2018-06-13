//*******************************************
// Nathan Schnitzer
// Coin.java
// 3/15/17
// Represents a coin being flipped
//*******************************************

package program5_6;

public class Coin implements Lockable {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int key;
	private boolean state;
	
	private int face;
	
	//Constructs the coin object
	public Coin()
	{
		
		state = true;
	}
	
	//Flips the coin
	public void flip()
	{
		face = (int)(Math.random() * 2);
	}
	
	//Returns true if the face of the coin is heads
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	
	public boolean locked() //Returns false if locked
	{
		return state;
	}
	
	public void unlock(int k) //Will unlock the program if given the key
	{
		if (k == key)
		{
			state = true;
		}
	}
	
	public void lock(int k) //will lock the class
	{
		setKey(k);
		state = false;
	}
	
	public void setKey(int k) //sets the key
	{
		if (state == true)
		key = k;
	}
	
	//Returns the current face of the coin as a string
	public String toString()
	{
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}

}
