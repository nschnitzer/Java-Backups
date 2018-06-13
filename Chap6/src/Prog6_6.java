//**********************************************************
// Nathan Schnitzer
// Program 6_6
// 5/11/17
// This program will manage 30 savings accounts
//**********************************************************

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Prog6_6 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		Account[] savings = new Account[30];
		String[] names = {"Jim F", "Dave G", "Jess C", "Erin A", "Chris A", "Dennis Y", "Ryan K", "Nathan L", "Phil S", "Matt T",
							"Nick M", "Amanda D", "Sarah H", "Dan V", "Kyle D", "Mark S", "Melissa R", "Riley U", "Xavier W", "Hannah B",
							"Ashley B", "Scott I", "Patty D", "Rachael V", "Lindsay T", "Walter W", "Henry M", "Dylan S", "Daniel B", "Arthur L"};
		System.out.println(names.length);
		
		//Instantiate the arrays
		for (int i = 0; i < 30; i ++)
		{
			savings[i] = new Account(names[i], i, (gen.nextDouble() * 1000.0));
			System.out.println(savings[i].toString());
		}
		
		//Create interface for depositing and withdrawing
		String putOrTake = "y";
		System.out.println("Would you like to make a deposit or withrawal? (y/n)");
		putOrTake = scan.next();
		System.out.println("Enter Account Number");
		int acctNum = scan.nextInt();
		System.out.println();
		System.out.println(savings[acctNum].toString());
		System.out.println();
		while (putOrTake.equalsIgnoreCase("y"))
		{
			String shouldDeposit;
			System.out.println("Would you like to make a deposit? (y/n)");
			shouldDeposit = scan.next();
			
			if (shouldDeposit.equalsIgnoreCase("y"))
			{
				System.out.println("Enter the amount being deposited: ");
				savings[acctNum].deposit(scan.nextDouble());
				System.out.println("Done");
			}
			else
			{
				System.out.println("Please enter the fee of the withdrawl: ");
				double fee = scan.nextDouble();
				System.out.println("Please enter the amount being withdrawn: ");
				savings[acctNum].withdraw(scan.nextDouble(), fee);
				System.out.println("Done");
			}
			System.out.println();
			System.out.println("Any more withdrawls or deposits? (y/n)");
			putOrTake = scan.next();
		}
		
		//Adds 3% interest to all accounts
		System.out.println();
		System.out.println("Adding interest to all accounts...");
		for (int p = 0; p < 30; p ++)
		{
			savings[p].addInterest();
		}
		System.out.println("Done");
		System.out.println();
		System.out.println(Arrays.toString(savings));
	
	}

}
