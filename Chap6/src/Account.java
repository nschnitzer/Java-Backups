//****************************************************************
// Nathan Schnitzer
// Account.java
// 5/11/17
// This will create and represent a savings account
//****************************************************************

import java.text.NumberFormat;

public class Account 
{
	NumberFormat fmt = java.text.NumberFormat.getCurrencyInstance();
	
	private final double RATE = 0.03;
	private int acctNumber;
	private double balance;
	private String name;
	
	//Constructs an account object and defines name, balance, and acctNumber
	public Account (String owner, int account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	//Validates the transaction then deposits the specified amount into the account. Returns the new balance
	public double deposit(double amount)
	{
		if (amount < 0)
		{
			System.out.println();
			System.out.println("Error: Deposit Amount is invalid.");
			System.out.println(acctNumber + " "+ fmt.format(amount));
		}
		else
		{
			balance = balance + amount;
		}
		
		return balance;
	}
	
	//Withdraws the specified amount and returns the new balance
	public double withdraw(double amount, double fee)
	{
		amount += fee;
		
		if (amount < 0) //Withdraw value is negative
		{
			System.out.println();
			System.out.println("Error: Withdraw amount is invalid");
			System.out.println("Account: " + acctNumber);
			System.out.println("Requested: " + fmt.format(amount));
		}
		else
		{
			if (amount > balance) // withdraw amount exceeds the balance
			{
				System.out.println();
				System.out.println("Error: Insufficient Funds");
				System.out.println("Account: " + acctNumber);
				System.out.println("Requested: " + fmt.format(amount));
				System.out.println("Available: " + fmt.format(balance));
			}
			else
			{
				balance = balance - amount;
			}
		}
		
		return balance;
	}
	
	
	//Adds interest to the account and returns the new balance
	public double addInterest()
	{
		balance += (balance * RATE);
		return balance;
	}
	
	//Returns the current balance of the account
	public double getBalance()
	{
		return balance;
	}
	
	//Returns the account number
	public int getAccountNumber()
	{
		return acctNumber;
	}
	
	//Returns a string of the description of the account
	public String toString()
	{
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}

}
