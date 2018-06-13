//*****************************************************************
// Nathan Schnitzer
// Task.java
// 4/3/17
// Implements and utilizes Priority interface
//*****************************************************************

public class Task implements Priority
{
	private int priLevel;
	
	//Creates a Task Object
	public Task(int level)
	{
		setPriority(level);
	}
	
	//sets the priority level
	public void setPriority(int level)
	{
		priLevel = level;
	}
	
	public int getPriority()
	{
		return priLevel;
	}

}
