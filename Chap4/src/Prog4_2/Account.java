//************************************************************************
// Nathan Schnitzer
// Program 4_1 Account class
// 1/25/17
// This will make a new method to support new 
package Prog4_2;

import java.text.NumberFormat;

public class Account {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private final double RATE = .035; //Interest rate
	
	//instance variables
	private int acctNumber;
	private double balance;
	private String name;
	
	//Create account without initial balance
	public Account (String own, int number)
		{
			name = own;
			acctNumber = number;
			balance = 0.0;
		}
	
	//Create account
	public Account (String owner, int account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	
	//Deposit method
	public double deposit (double amount)
	{
		if (amount < 0)
		{
			System.out.println();
			System.out.println("Error: Deposit amount is invalid.");
			System.out.println(acctNumber + " " + fmt.format(amount));
		}
		else
			balance = balance + amount;
		return balance;
	}
	
	//Withdraws from account
	public double withdraw (double amount, double fee)
	{
		amount += fee;
		
		if (amount < 0)
		{
			System.out.println();
			System.out.println("Error: Withdraw amount is invalid.");
			System.out.println("Account: " + acctNumber);
			System.out.println("Requested: " + fmt.format(amount));
		}
		else
		{
			if (amount > balance)
			{
				System.out.println();
				System.out.println("Error: Insufficient funds.");
				System.out.println("Account: " + acctNumber);
				System.out.println("Requested: " + fmt.format(amount));
				System.out.println("Available: " + fmt.format(balance));
			}
			else
				balance = balance - amount;
		}
			
			return balance;
		}
	
	//Add Interest
	public double addInterest ()
	{
		balance += (balance * RATE);
		return balance;
		
	}
	
	//Return Current Balance
	public double getBalance ()
	{
		return balance;
	}
	
	//Return Account Number
	public int getAccountNumber ()
	{
		return acctNumber;
	}
	
	//Returns one line desc of account as string
	public String toString ()
	{
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}
	
	public String transfer (Account to, double amount, double fee)
	{
		double beforeWithdraw = getBalance();
		if (beforeWithdraw != withdraw(amount, fee))
		{
			withdraw(amount, fee);
			to.deposit(amount);
			return "Transfer complete!";
		}
		else
		{
			return "Transfer failed";
		}
	}

}
