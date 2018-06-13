
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ACSL_Duplicates 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("src/inputDuplicates.txt"));
		scan.useDelimiter("\\s*[, \n]\\s*");
		
		String str;
		DuplicateNode root;
		
		for(int i = 0;i < 5;i++)
		{
			str = scan.nextLine();
			str = str.toUpperCase();
			int begin = 0;
			while(!isAlphabetic(str.charAt(begin) + ""))
				begin++;
			root = new DuplicateNode(str.charAt(begin));
			
			for(int j = 1;j < str.length();j++)
			{
				if(isAlphabetic(str.charAt(j) + ""))
				{
					DuplicateNode newNode = new DuplicateNode(str.charAt(j));
					add(root,newNode);
				}
			}
			
			System.out.println(addSingleNodes(root));
		}
		scan.close();
	}
	
	private static void add(DuplicateNode current,DuplicateNode newNode)
	{
		if(current.getLetter() > newNode.getLetter()) 
		{
			if(current.getLeft() == null)
				current.setLeft(newNode);
			else
				add(current.getLeft(), newNode);
		}
		else if(current.getLetter()< newNode.getLetter())
		{
			if(current.getRight() == null)
				current.setRight(newNode);
			else
				add(current.getRight(), newNode);
		}
		else
		{
			current.increment();
		}
	}
	
	private static int addSingleNodes(DuplicateNode current)
	{
		if(current == null)
			return 0;
		int number;
		if(current.getLeft() != null ^ current.getRight() != null)
			number = current.getNumber();
		else
			number = 0;
		
		return number + addSingleNodes(current.getLeft()) + addSingleNodes(current.getRight());
	}
	
	private static boolean isAlphabetic(String str)
	{
		return str.matches("[A-Z]");
	}
}
