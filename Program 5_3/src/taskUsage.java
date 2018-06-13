//*******************************************************************
// Nathan Schnitzer
// taskUsage.java program 5.3
// 4/3/17
// Will utilize Priority and use Task objects
//*******************************************************************
public class taskUsage {

	public static void main(String[] args) {
		//Create 4 Task objects
		Task highest = new Task(1);
		Task midHigh = new Task(2);
		Task midLow = new Task(3);
		Task low = new Task(4);
		
		//Execute the highest priority level of two objects
		if (midHigh.getPriority() < midLow.getPriority())
		{
			System.out.println(midHigh.getPriority());
		}
		else
		{
			System.out.println(midLow.getPriority());
		}
		
		if (highest.getPriority() < low.getPriority())
		{
			System.out.println(highest.getPriority());
		}
		else
		{
			System.out.println(low.getPriority());
		}

	}

}
