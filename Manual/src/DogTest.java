//****************************************************************
// Nathan Schnitzer
// DogTest.java
// 6/9/17
// Test class that creates a dog and makes it speak
public class DogTest 
{

	public static void main(String[] args) 
	{
		Dog dog1;
		dog1 = new Yorkshire("Jimmy");
		System.out.println(dog1.getName() + " says " + dog1.speak());
		System.out.println(dog1.getName() + " weighs " + dog1.avgBreedWeight() + " lbs.");
		
		System.out.println();
		
		Dog dog2;
		dog2 = new Labrador("Dave", "Black");
		System.out.println(dog2.getName() + " says " + dog2.speak() + ".");
		System.out.println(dog2.getName() + " weighs " + dog2.avgBreedWeight() + " lbs.");

	}

}
