//*******************************************************
// Nathan Schnitzer
// Labrador.java
// 6/12/17
// Class that inherits Dog and holds information about a Labrador Retriever. 
//*******************************************************

public class Labrador extends Dog
{
	private String color; //black, yellow, or chocolate?
	private int breedWeight = 75;
	
	public Labrador(String name, String color)
	{
		super(name);
		this.color = color;
	}
	
	
	//Big Bark -- Overrides the speak method in Dog
	public String speak()
	{
		return "WOOF";
	}
	
	//Returns weight
	public int avgBreedWeight()
	{
		return breedWeight;
	}

}
