//****************************************
// Nathan Schnitzer
// Symbol.java
// 1/17/18
//****************************************

public class Symbol 
{
	private int position;
	private char symbol;
	//Constructs a Symbol Object
	public Symbol()
	{
		
	}
	
	public Symbol(int where, char symb)
	{
		position = where;
		symbol = symb;
	}
	
	//Returns the position
	public int getPosition()
	{
		return position;
	}
	
	//Returns the symbol
	public char getSymbol()
	{
		return symbol;
	}
	
	//Returns a toString
	public String toString()
	{
		return position + "\t" + symbol;
	}

}
