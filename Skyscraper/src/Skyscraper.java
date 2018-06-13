//*****************************************************
// Nathan Schnitzer
// Skyscraper.java
// 4/6/17
// Contest #4
//******************************************************

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Skyscraper {

	public static void main(String[] args) {
		//Create Scanner Object
		Scanner scan = new Scanner(System.in);
		for (int f = 1; f <= 5; f++)
		{
		int amount = 0;
		boolean useArray = true;
		
		//Create array of all possible combinations (a,b,c,d,e)
		int[] combos = {12345, 12354, 12435, 12453, 12534, 12543, 13245, 13254, 13425, 13452, 13524, 13542, 14235, 14253, 14325, 14352, 14523, 14532, 15234, 15243, 15324, 15342, 15423, 15432, 21345, 21354, 21435, 21453, 21534, 21543, 23145, 23154, 23415, 23451, 23514, 23541, 24135, 24153, 24315, 24351, 24513, 24531, 25134, 25143, 25314, 25341, 25413, 25431, 31245, 31254, 31425, 31452, 31524, 31542, 32145, 32154, 32415, 32451, 32514, 32541, 34125, 34152, 34215, 34251, 34512, 34521, 35124, 35142, 35214, 35241, 35412, 35421, 41235, 41253, 41325, 41352, 41523, 41532, 42135, 42153, 42315, 42351, 42513, 42531, 43125, 43152, 43215, 43251, 43512, 43521, 45123, 45132, 45213, 45231, 45312, 45321, 51234, 51243, 51324, 51342, 51423, 51432, 52134, 52143, 52314, 52341, 52413, 52431, 53124, 53142, 53214, 53241, 53412, 53421, 54123, 54132, 54213, 54231, 54312, 54321};
		
			
		//Prompt for the left clue
		System.out.println("Please enter left clue");
		int leftClue = scan.nextInt();
		
		//Prompt for the right clue
		System.out.println("Please enter right clue");
		int rightClue = scan.nextInt();
		
		//Create ArrayList object
		ArrayList<Integer> goodcombos = new ArrayList<Integer>();
		
		if (leftClue == 5 && rightClue == 1)
		{
			amount = 1;
			useArray = false;
		}
		else if (rightClue == 1 && leftClue== 5)
		{
			amount = 1;
			useArray = false;
		}
		
		//Create a for loop to test combos
		for (int k = 0; k < 120; k++)
		{
			int rightViewCount = 1, leftViewCount = 1;
			boolean testRight = true;
			String strValue = Integer.toString(combos[k]);
			
				int place1, place2, place3, place4, place5;
				place1 = Character.getNumericValue(strValue.charAt(0));
				place2 = Character.getNumericValue(strValue.charAt(1));
				place3 = Character.getNumericValue(strValue.charAt(2));
				place4 = Character.getNumericValue(strValue.charAt(3));
				place5 = Character.getNumericValue(strValue.charAt(4));
				
				//5 is tallest building while 1 is smallest //place shows position
				
				if (place1 == 5)
					leftViewCount = 1; //Can only see tallest building in front
				else if (place2 == 5)
					leftViewCount = 2;
				else
				{
					if (place2 > place1) //Can see building #2 and #1
					{
						leftViewCount++;
						if (place3 > place2) //Can see buildings #1,2,3
						{
							leftViewCount++;
							if(place4 > place3) //Can see #1,2,3,4
							{
								leftViewCount++;
								if (place5 > place4) //Can see #1,2,3,4,5
								{
									leftViewCount = 5;
									rightViewCount = 1;
									testRight = false;
								}
							}
							else
							{
								if (place5 > place3) //Can see #1,2,3,5
								{
									leftViewCount++;
								}
							}
						}
						else
						{
							if (place4 > place2) //Can see buildings #1,2,4
							{
								leftViewCount++;
								if (place5 > place4) //Can see #1,2,4,5
								{
									leftViewCount++;
								}
							}
							else
							{
								if (place5 > place2) //Can see buildings #1,2,5
								{
									leftViewCount = 5;
									rightViewCount = 1;
								}
							}
						}
					}
					else
					{
						if (place3 > place1) //Can see#1,3
						{
							leftViewCount++;
							if (place4 > place3) //Can see #1,3,4
							{
								leftViewCount++;
								if (place5 > place4) //Can see #1,3,4,5
								{
									leftViewCount++;
								}
							}
							else
							{
								if (place5 > place3) //Can see #1,3,5
								{
									leftViewCount++;
								}
							}
						}
						else
						{
							if (place4 > place1) //Can see #1,4
							{
								leftViewCount++;
								if (place5 > place4) //Can see #1,4,5
									leftViewCount++;
							}
							else
								leftViewCount = 2; //Can see #1,5
						}
					}
				}
				
				//Test right view
				if (testRight)
				{
					//5 is tallest building while 1 is smallest //place shows position from right
					if (place5 ==5)
						rightViewCount = 1; //Can only see tallest building on right
					else if (place4 == 5)
						rightViewCount = 2;
					else
					{
						if (place4 > place5) //Can see building #2 and #1
						{
							rightViewCount++;
							if (place3 > place4) //Can see buildings #1,2,3
							{
								rightViewCount++;
								if(place2 > place3) //Can see #1,2,3,4
								{
									rightViewCount++;
									if (place1 > place2) //Can see #1,2,3,4,5
									{
										rightViewCount = 5;
										leftViewCount = 1;
										
									}
								}
								else
								{
									if (place1 > place3) //Can see #1,2,3,5
									{
										rightViewCount++;
									}
								}
							}
							else
							{
								if (place2 > place4) //Can see buildings #1,2,4
								{
									rightViewCount++;
									if (place1 > place2) //Can see #1,2,4,5
									{
										rightViewCount++;
									}
								}
								else
								{
									if (place1 > place4) //Can see buildings #1,2,5
									{
										rightViewCount = 3;
										leftViewCount = 1;
									}
								}
							}
						}
						else
						{
							if (place3 > place5) //Can see#1,3
							{
								rightViewCount++;
								if (place2 > place3) //Can see #1,3,4
								{
									rightViewCount++;
									if (place1 > place2) //Can see #1,3,4,5
									{
										rightViewCount++;
									}
								}
								else
								{
									if (place1 > place3) //Can see #1,3,5
									{
										rightViewCount++;
									}
								}
							}
							else
							{
								if (place2 > place5) //Can see #1,4
								{
									rightViewCount++;
									if (place1 > place2) //Can see #1,4,5
										rightViewCount++;
								}
								else
									rightViewCount = 2; //Can see #1,5
							}
						}
					}
				}
				if (rightViewCount == rightClue && leftViewCount == leftClue)
				{
					goodcombos.add(combos[k]);
					
				}
				
		}
		if (useArray)
		{
			amount = goodcombos.size();
		}
		
		System.out.println(goodcombos);
		System.out.println(amount);
		}

	}
	

}