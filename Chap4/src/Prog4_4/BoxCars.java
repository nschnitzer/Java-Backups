package Prog4_4;

public class BoxCars {

	public static void main(String[] args) {
		PairOfDice dice1 = new PairOfDice();
		PairOfDice dice2 = new PairOfDice();
		int count, boxcars;
		
		count = 0;
		boxcars = 0;
		while (count < 1000)
		{
			dice1.roll();
			dice2.roll();
			
			if(dice1.getFaceValue() == 6 && dice2.getFaceValue() == 6)
				boxcars++;
			
			count++;
		}
		System.out.println(boxcars);

	}

}
