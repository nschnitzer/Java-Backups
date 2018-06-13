//***************************************************************
// Nathan Schnitzer
// Tracking Sales Program
// 4/20/17
// This program will read and store sales info in arrays, then compute sum, avg, min and max, etc...
//***************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Sales 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		int sum, maxSale = 0, minSale = 0;
		int maxSaleId = 0, minSaleId = 0;
		int salespeople = 0;
		
		//Prompt for the amount of salespeople
		System.out.println("Enter amount of salespeople:");
		salespeople = scan.nextInt();
		int[] sales = new int[salespeople];
		
		//Prompts for the sales info
		for (int i = 0; i < sales.length; i++)
		{
			System.out.println("Enter sales for salesperson " + (i+1));
			sales[i] = scan.nextInt();
			if (sales[i] > maxSale)
			{ 
				if (i == 0)
				{
					minSale = sales[i];
					minSaleId = i + 1;
				}
				maxSale = sales[i];
				maxSaleId = i+1;
			}
			if (sales[i] < minSale)
			{
				minSale = sales[i];
				minSaleId = i+1;
			}
		}
		NumberFormat salefmt = NumberFormat.getCurrencyInstance();
		
		//Computes Total and average Sales
		System.out.println("\nSalesperson Sales");
		System.out.println("------------------");
		sum = 0;
		for (int i = 0; i < sales.length; i++)
		{
			System.out.println("     " + (i+1) + "     " + salefmt.format(sales[i]));
			sum += sales[i];
		}
		
		System.out.println("\nAverage Sales: " + salefmt.format(sum/salespeople));
		System.out.println("\nTotal Sales: " + salefmt.format(sum));
		System.out.println();
		
		//Announces the salesperson who sold the most
		System.out.println("Salesperson " + maxSaleId + " had the highest sale with " + salefmt.format(maxSale));
		
		//Announces the salesperson who sold the least
		System.out.println("Salesperson " + minSaleId + " had the lowest sale with " + salefmt.format(minSale));
		
		//Prompts the user to enter a value
		System.out.println();
		System.out.println("Please enter a value");
		int expectation = scan.nextInt();
		int amountExceed = 0;
		System.out.println();
		
		//Prints out who exceeded the value and how many people did
		for (int i = 0; i < salespeople; i++)
		{
			if (sales[i] > expectation)
			{
				System.out.println("Salesperson " + (i+1) + " has exceeded expectations");
				amountExceed++;
			}
		}
		
		//Print out how many people exceeded the value
		System.out.println();
		System.out.println(amountExceed + " salespeople have exceeded expectations");
		
		scan.close();

	}

}


/* Output:
Enter amount of salespeople:
6
Enter sales for salesperson 1
2496
Enter sales for salesperson 2
1315
Enter sales for salesperson 3
1427
Enter sales for salesperson 4
806
Enter sales for salesperson 5
3599
Enter sales for salesperson 6
2893

Salesperson Sales
------------------
     1     $2,496.00
     2     $1,315.00
     3     $1,427.00
     4     $806.00
     5     $3,599.00
     6     $2,893.00

Average Sales: $2,089.00

Total Sales: $12,536.00

Salesperson 5 had the highest sale with $3,599.00
Salesperson 4 had the lowest sale with $806.00

Please enter a value
2000

Salesperson 1 has exceeded expectations
Salesperson 5 has exceeded expectations
Salesperson 6 has exceeded expectations

3 salespeople have exceeded expectations
*/