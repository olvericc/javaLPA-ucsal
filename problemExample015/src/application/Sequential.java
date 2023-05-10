package application;

public class Sequential {
	
	public static int[] sequentialValues() {
		int[] vect = new int[10];
		
		for (int i = 0, var = 2; i < vect.length;) {
			if (var % 5 == 0 && var % 2 == 0) {
				vect[i] = var;
				i++;
			}
			var++;
		}
		return vect;
	}
	
	public static int[] pairValues() {
		
		int[] vect = new int[5];
		
		for (int i = 0, var = 2; i < vect.length; i++) {
			vect[i] = var;
			var += 2;
		}
		
		return vect;
	}

}
