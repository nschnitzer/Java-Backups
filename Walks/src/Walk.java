//*************************************************************
// Nathan Schnitzer
// ACSLWalk.java
// 3/6/18
// Contest #3
//*************************************************************


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Walk
{
	static int prevRow=0, prevColumn=0, thisRow=0, thisColumn=0, nextRow=0, nextColumn=0;;

	public static void firstMove (int Row, int Column, String direction, int array [][])
	{
		if (array[Row][Column] == 0)
		{
			//Move Right
			if (direction.equalsIgnoreCase("L") && Column!=7)
			{
				nextRow = Row;
				nextColumn = Column+1;
			}
			else if (direction.equalsIgnoreCase("L") && Column==7)
			{
				nextRow = Row;
				nextColumn = 0;
			}
			//Move left
			if (direction.equalsIgnoreCase("R") && Column!=0)
			{
				nextRow = Row;
				nextColumn = Column-1;
			}
			else if (direction.equalsIgnoreCase("R") && Column==0)
			{
				nextRow = Row;
				nextColumn = 7;
			}
			//Move Up
			if (direction.equalsIgnoreCase("B") && Row!=0)
			{
				nextRow = Row-1;
				nextColumn = Column;
			}
			else if (direction.equalsIgnoreCase("B") && Row==0)
			{
				nextRow = 7;
				nextColumn = Column;
			}
			//Move Down
			if (direction.equalsIgnoreCase("A") && Row!=7)
			{
				nextRow = Row+1;
				nextColumn = Column;
			}
			else if (direction.equalsIgnoreCase("A") && Row==7)
			{
				nextRow = 0;
				nextColumn = Column;
			}
		}
		else
		{
			//Move up
			if (direction.equalsIgnoreCase("L") && Row!=0)
			{
				nextRow = Row-1;
				nextColumn = Column;
			}
			else if (direction.equalsIgnoreCase("L") && Row==0)
			{
				nextRow = 7;
				nextColumn = Column;
			}
			//Move Down
			if (direction.equalsIgnoreCase("R") && Row!=7)
			{
				nextRow = Row+1;
				nextColumn = Column;
			}
			else if (direction.equalsIgnoreCase("R") && Row==7)
			{
				nextRow = 0;
				nextColumn = Column;
			}
			//Move Left
			if (direction.equalsIgnoreCase("B") && Column!=0)
			{
				nextRow = Row;
				nextColumn = Column-1;
			}
			else if (direction.equalsIgnoreCase("B") && Column==0)
			{
				nextRow = Row;
				nextColumn = 7;
			}
			//Move Right
			if (direction.equalsIgnoreCase("A") && Column!=7)
			{
				nextRow = Row;
				nextColumn = Column+1;
			}
			else if (direction.equalsIgnoreCase("A") && Column==7)
			{
				nextRow = Row;
				nextColumn = 0;
			}
		}
	}

	public static void thisMove (int Row, int Column, int array[][], int repeater[][])
	{
		if (array[Row][Column] == 0)
		{
			//Move Right
			if (Column == prevColumn+1 || Column==0 && prevColumn==7)
			{
				prevColumn = Column;
				if (Column!=7)
					thisColumn ++;
				else if (Column==7)
					thisColumn=0;

			}
			//Move Left
			if (Column==prevColumn-1  || Column==7 && prevColumn==0)
			{
				prevColumn = Column;
				if (Column!=0)
					thisColumn --;
				else if (Column==0)
					thisColumn=7;
			}
			//Move Up
			if (Row==prevRow-1  || Row==7 && prevRow==0)
			{
				prevRow = Row;
				if (Row!=0)
					thisRow --;
				else if (Row==0)
					thisRow=7;
			}
			//Move down
			if (Row == prevRow+1 || Row==0 && prevRow==7)
			{
				prevRow = Row;
				if (Row!=7)
					thisRow ++;
				else if (Row==7)
					thisRow=0;

			}
		}
		else
		{
			if (Column == prevColumn+1 || Column==0 && prevColumn==7) //from the left side3
			{
				//Move up
				if (repeater[Row][Column]%4==1)
				{
					prevRow = Row;
					prevColumn = Column;
					if (Row!=0)
						thisRow--;
					else if (Row==0)
						thisRow=7;
				}
				//move right
				if (repeater[Row][Column]%4==2)
				{
					prevColumn = Column;
					prevRow = Row;
					if (Column!=7)
						thisColumn ++;
					else if (Column==7)
						thisColumn=0;
				}
				//Move Down
				if (repeater[Row][Column]%4==3)
				{
					prevRow = Row;
					prevColumn = Column;
					if (Row!=7)
						thisRow ++;
					else if (Row==7)
						thisRow=0;
				}
				//Move Left
				if (repeater[Row][Column]%4==0)
				{
					prevColumn = Column;
					prevRow = Row;
					if (Column!=0)
						thisColumn --;
					else if (Column==0)
						thisColumn=7;
				}
			}

			if (Column == prevColumn-1 || Column==7 && prevColumn==0) //Move from the right side
			{
				//Move Down
				if (repeater[Row][Column]%4==1)
				{
					prevRow = thisRow;
					prevColumn = thisColumn;
					if (Row!=7)
						thisRow ++;
					else if (Row==7)
						thisRow=0;
				}
				//Move Left
				if (repeater[Row][Column]%4==2)
				{
					prevColumn = thisColumn;
					prevRow = thisRow;
					if (Column!=0)
						thisColumn --;
					else if (Column==0)
						thisColumn=7;
				}
				//Move Up
				if (repeater[Row][Column]%4==3)
				{
					prevRow = thisRow;
					prevColumn = thisColumn;
					if (Row!=0)
						thisRow--;
					else if (Row==0)
						thisRow=7;
				}
				//Move Right
				if (repeater[Row][Column]%4==0)
				{
					prevColumn = thisColumn;
					prevRow = thisRow;
					if (Column!=7)
						thisColumn ++;
					else if (Column==7)
						thisColumn=0;
				}
			}

			if (Row == prevRow-1 ||( Row==7 && prevRow==0)) //Move from below
			{
				//Move Left
				if (repeater[Row][Column]%4==1)
				{
					prevColumn = thisColumn;
					prevRow = thisRow;
					if (Column!=0)
						thisColumn --;
					else if (Column==0)
						thisColumn=7;
				}
				//Move Up
				if (repeater[Row][Column]%4==2)
				{
					prevRow = thisRow;
					prevColumn = thisColumn;
					if (Row!=0)
						thisRow--;
					else if (Row==0)
						thisRow=7;
				}
				//Move Right
				if (repeater[Row][Column]%4==3)
				{
					prevColumn = thisColumn;
					prevRow = thisRow;
					if (Column!=7)
						thisColumn ++;
					else if (Column==7)
						thisColumn=0;
				}
				//Move Down
				if (repeater[Row][Column]%4==0)
				{
					prevRow = thisRow;
					prevColumn = thisColumn;
					if (Row!=7)
						thisRow ++;
					else if (Row==7)
						thisRow=0;
				}
			}

			if (Row == prevRow+1 && Column == prevColumn|| Row==0 && prevRow==7)//From above
			{
				//Move Right
				if (repeater[Row][Column]%4==1)
				{
					prevColumn = thisColumn;
					prevRow = thisRow;
					if (Column!=7)
						thisColumn ++;
					else if (Column==7)
						thisColumn=0;
				}
				//Move Down
				if (repeater[Row][Column]%4==2)
				{
					prevRow = thisRow;
					prevColumn = thisColumn;
					if (Row!=7)
						thisRow ++;
					else if (Row==7)
						thisRow=0;
				}
				//Move Left
				if (repeater[Row][Column]%4==3)
				{
					prevColumn = thisColumn;
					prevRow = thisRow;
					if (Column!=0)
						thisColumn --;
					else if (Column==0)
						thisColumn=7;
				}
				//Move Up
				if (repeater[Row][Column]%4==0)
				{
					prevRow = thisRow;
					prevColumn = thisColumn;
					if (Row!=0)
						thisRow--;
					else if (Row==0)
						thisRow=7;
				}
			}
			repeater[Row][Column]++;
		}
	}

	public static void main(String[] args) throws java.io.FileNotFoundException
	{
		Scanner scan = new Scanner(new File("src/Inputs.txt"));
		
		//Instantiate 2d Array
		int [][] map = new int [8][8];
		for (int i=0; i<8; i++)
		{
			String input = scan.next();
			String value = Integer.toBinaryString(Integer.parseInt(input, 16)); 

			for (int j=0; j<8; j++)
			{
				if (value.length()==8)
					map[i][j] = Character.getNumericValue(value.charAt(j));
				else
				{
					if (j < (8-value.length()))
						map[i][j] = 0;
					else
						map[i][j] = Character.getNumericValue(value.charAt(j-(8-value.length())));
				}
			}
		}

		for(int z = 0; z < 5; z++)
		{
			String next = scan.nextLine();
			thisRow = scan.nextInt()-1;
			thisColumn = scan.nextInt()-1;
			String direction = scan.next();
			int move = scan.nextInt();
			int time = 0;

			// array to count number of times entered
			int [][] repeater = new int [8][8];
			for (int i=0; i<8; i++)
				for (int j=0; j<8; j++)
					repeater[i][j] = 1;

			//first move
			Walk.firstMove(thisRow, thisColumn, direction, map);
			time++;
			repeater[thisRow][thisColumn] ++; //count reentrance
			prevColumn = thisColumn;
			thisColumn = nextColumn;
			prevRow = thisRow;
			thisRow = nextRow;
			//next few moves
			while(time<move)
			{
				Walk.thisMove(thisRow, thisColumn, map, repeater);
				//count reentrance
				time++;
			}
			System.out.println((thisRow+1) + ", " + (thisColumn+1));
		}
	}
}
