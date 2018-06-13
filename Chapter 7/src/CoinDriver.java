//*********************************************************
// Nathan Schnitzer
// Program 7.1
// 6/7/17
// This will contain many Monetary Coin objects and show inheritance
//*********************************************************
public class CoinDriver 
{

	public static void main(String[] args) 
	{
		//Create 4 MonetaryCoin objects
		MonetaryCoin myCoin1 = new MonetaryCoin(.25);
		MonetaryCoin myCoin2 = new MonetaryCoin(.5);
		MonetaryCoin myCoin3 = new MonetaryCoin(.1);
		MonetaryCoin myCoin4 = new MonetaryCoin(.05);
		MonetaryCoin myCoin5 = new MonetaryCoin(.01);
		
		//Print out coins
		System.out.println(myCoin1);
		System.out.println();
		System.out.println(myCoin2);
		System.out.println();
		System.out.println(myCoin3);
		System.out.println();
		System.out.println(myCoin4);
		System.out.println();
		System.out.println(myCoin5);
		System.out.println();
		
		//Flip 3 Monetary Coins
		System.out.println("Flipping Coins 1,3,4...");
		System.out.println();
		
		System.out.println("Coin 1 before flip: " + myCoin1);
		myCoin1.flip();
		System.out.println("Flipped Coin 1: " + myCoin1);
		System.out.println();
		
		System.out.println("Coin 3 before flip: " + myCoin3);
		myCoin3.flip();
		System.out.println("Flipped Coin 3: " + myCoin3);
		System.out.println();
		
		System.out.println("Coin 4 before flip: " + myCoin4);
		myCoin4.flip();
		System.out.println("Flipped Coin 4: " + myCoin4);
		
		
	}

}
