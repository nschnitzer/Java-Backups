	//*******************************************************
	// Nathan Schnitzer
	// 6/6/17
	// Program 7.1
	// This will represent a coin's parent
	//******************************************************

	public class  Coin
	{
		private final int HEADS = 0;
		private final int TAILS = 1;
		
		private int face;
		
		//Constructs the coin object
		public Coin()
		{
			flip();
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

