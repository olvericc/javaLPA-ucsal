package application;

public class Fibonacci {

	public static int fibonacciValues(int length) {
		int[] vect = new int[length];
		
		for (int i = 0, a = 0, b = 1, aux; i < vect.length; i++) {
			vect[i] = a;
			aux = a + b;
			a = b;
			b = aux;
		}
		
		return 0;	
	}
	
}
