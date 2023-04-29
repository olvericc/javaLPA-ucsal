package application;

public class Sequentials {

	public static int fibonacci(int quantityOfElements) {
		int sum = 0;
		int a = 0, b = 1, aux;

		for (int i = 0; i < quantityOfElements; i++) {
			System.out.print(a + " ");
			aux = a + b;
			a = b;
			b = aux;
		}
		
		return sum;
	}
	
	public static double geometricProgression(int limit) {
		int sum = 0;
		
		return sum;
	}
	
	public static double arithmeticProgression(int limit) {
		int sum = 0;
		
		return sum;
	}

}
