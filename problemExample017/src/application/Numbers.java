package application;

public class Numbers {
	
	public static int countPairValues(int[] vect) {
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != 0 && vect[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int sumVectorValues() {
		return 0;
	}

}
