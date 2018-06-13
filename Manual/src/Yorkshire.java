//******************************************************
// Nathan Schnitzer
// Yorskhire.java
// 6/9/17
// This will hold info about a Yorkshire terrier and inherit things from Dog.java
//******************************************************
public class Yorkshire extends Dog
{
	private int breedWeight = 5;
	
	public Yorkshire(String name)
	{
		super(name);
	}
	
	//Small Bark -- overrides speak from Dog
	public String speak()
	{
		return "woof";
	}
	
	public int avgBreedWeight()
	{
		return breedWeight;
	}

}
