//***************************************************************************
// Nathan Schnitzer
// Program 4_1
// 1/25/17
// This will change the banking class to allow use of transfer method
//***************************************************************************

package prog4_1;

public class Banking {

	public static void main(String[] args) 
	{
	Account acct1 = new Account("Ted Murphy", 72354, 102.56);
	Account acct2 = new Account("Anita Gomez", 69713, 40.00);
	Account acct3 = new Account("Sanchit Reddy", 93757, 759.32);
	
	acct1.deposit(25.85);
	
	double gomezBalance = acct2.deposit(500.00);
	System.out.println("Gomez balance after deposit: " + gomezBalance);
	
	System.out.println("Gomez balance after withdrawl: " + acct2.withdraw(430.75, 1.50));
	System.out.println();
	System.out.println();
	
	
	acct1.addInterest();
	acct2.addInterest();
	acct3.addInterest();
	
	//Print account balances prior to the transfer 
	System.out.println(acct3.getFormatBalance());
	System.out.println(acct2.getFormatBalance());
	System.out.println();

	
	//create transfer
	System.out.println(acct3.transfer(acct2, 98.00, .75));
	
	//Print balances
		System.out.println(acct3.getFormatBalance());
		System.out.println(acct2.getFormatBalance());

	}

}
