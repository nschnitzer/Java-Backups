//********************************************************************************
// Nathan Schnitzer
// Student.java
// 9/18/17
// This will represent a Student Object
//********************************************************************************


public class Student 
{
	private String lastName;
	private double gpa;
	private String firstName;
	private String address;
	private int grade;
	
	public Student (String lName, String address, String f, double g, int grd)
	{
		grade = grd;
		lastName  = lName;
		gpa = g;
		firstName = f;
		this.address = address;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	
	public String toString()
	{
		return "Name: " + getFirstName() + " " + getLastName() + "\n" + "Address: " + getAddress() + "\n" + "Grade: " + grade + "\n"+ "GPA: " + getGPA();
	}

}
