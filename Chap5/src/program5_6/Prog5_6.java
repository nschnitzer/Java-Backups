//************************************************
// Nathan Schnitzer
// Program 5.6
// 3/15/17
// This program will utilize the Lockable interface and the Coin class
//************************************************

package program5_6;
import java.util.Scanner;

public class Prog5_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int headCount = 0, tailCount = 0, lockCount = 0;
		final int LIMIT = 37;
		int key = 12345;
		
		Coin myCoin = new Coin();
		myCoin.setKey(key);
		myCoin.unlock(key);
		
		//Run a loop 37 times
		for (int k = 1; k <= LIMIT; k++)
		{
			
			if (myCoin.locked())
			{
				myCoin.flip();
				System.out.println(myCoin);
				if (myCoin.isHeads())
				{
					headCount++;
				}
				else 
					tailCount++;
			}
			else
			{
				lockCount++;
				System.out.println("Locked");
			}
			
			if (k % 10 == 0)
			{
				myCoin.lock(key);
			}
			else if (k % 5 == 0 && !(k % 10 == 0))
			{
				myCoin.unlock(key);

			}
			
				
				/*System.out.println("Do you want to change the key? (yes/no) ");
				if (scan.nextLine().equalsIgnoreCase("yes"))
				{
					System.out.println("Enter the new key");
					myCoin.setKey(scan.nextInt());*
				}*/
			
		}
		System.out.println();
		System.out.println("Lock Count:");
		System.out.println(lockCount);
		System.out.println("Head Count:");
		System.out.println(headCount);
		System.out.println("Tail Count:");
		System.out.println(tailCount);

	}

}
