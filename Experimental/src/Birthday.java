
public class Birthday {

	public static void main(String[] args) {
		double pA = (365/365);
		for (int i = 364; i >= 0; i--)
		{
			pA = pA * (i/365);
		}
		
		System.out.println(pA);
		pA = 1 - pA;
		
		System.out.println(pA);

	}

}
