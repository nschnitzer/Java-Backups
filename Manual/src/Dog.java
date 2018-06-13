//****************************************************
// Nathan Schnitzer
// Dog.java
// 6/9/17
// Class that holds a dog's name and speech
//****************************************************

public abstract class Dog 
{
	protected String name;
	
	//Constructor -- Store name
	public Dog(String name)
	{
		this.name = name;
	}
	
	//Returns the dog's name
	public String getName()
	{
		return name;
	}
	
	//Returns a String with the dog's comments
	public String speak()
	{
		return "woof";
	}
	
	public abstract int avgBreedWeight();

}
