package application;

public class Sequentials {

	public static int fibonacci(int quantityOfElements) {
		int sum = 0;
		int a = 0, b = 1, aux;

		for (int i = 0; i < quantityOfElements; i++) {
			//System.out.print(a + " ");
			sum += a;
			aux = a + b;
			a = b;
			b = aux;
		}
		
		return sum;
	}
	
	public static double geometricProgression(int length) {
		int sum = 0, count = 0 ,initialT = 3, rs = 2;
		
		while (count < length) {
			sum += initialT;
			initialT *= rs;
			count++;
		}
		
		return sum;
	}
	
	public static int arithmeticProgression(int limit) {
		int sum = 0;
				
		for (int initialT = 5, rs = 13, count = 0; count <= limit;) {
			initialT += rs;
			sum += initialT;
		}
		
		return sum;
	}

}
