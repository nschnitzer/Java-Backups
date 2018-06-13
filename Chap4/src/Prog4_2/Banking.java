package Prog4_2;

import prog4_1.Account;

public class Banking {

	public static void main(String[] args) 
	{
	Account acct1 = new Account("Ted Murphy", 72354, 102.56);
	Account acct2 = new Account("Anita Gomez", 69713, 40.00);
	Account acct3 = new Account("Sanchit Reddy", 93757, 759.32);
	Account acct4 = new Account("John Doe", 25415);
	
	acct1.deposit(25.85);
	
	System.out.println(acct4.toString());
	System.out.println();
	

	
	
	acct1.addInterest();
	acct2.addInterest();
	acct3.addInterest();
	
	}
}