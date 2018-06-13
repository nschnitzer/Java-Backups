
public class DuplicateNode 
{
	private char letter;
	private int number;
	private DuplicateNode left;
	private DuplicateNode right;
	
	public DuplicateNode(char l)
	{
		letter = l;
		number = 1;
	}
	
	public char getLetter()
	{
		return letter;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void increment()
	{
		number++;
	}
	
	public DuplicateNode getLeft()
	{
		return left;
	}
	
	public DuplicateNode getRight()
	{
		return right;
	}
	
	public void setLeft(DuplicateNode l)
	{
		left = l;
	}
	
	public void setRight(DuplicateNode r)
	{
		right = r;
	}
}
