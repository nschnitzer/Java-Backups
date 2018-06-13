//*********************************************************
// Nathan Schnitzer
// Program 6.7 This mimics the GradeRange class
// 6/7/17
// This program will change GradeRange from using parallel arrays
// ********************************************************
public class Prog6_7 
{

	public static void main(String[] args) 
	{
		String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
		
		int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
		
		for (int level = 0; level < cutoff.length; level++)
			System.out.println(grades[level] + "\t" + cutoff[level]);

	}

}
