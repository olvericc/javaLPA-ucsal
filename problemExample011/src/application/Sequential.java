package application;

public class Sequential {

	public static int fibonacci(int quantityOfElements) {
		int sum = 0;
		int a = 0, b = 1, aux;

		for (int i = 0; i < quantityOfElements; i++) {
			sum += a;
			aux = a + b;
			a = b;
			b = aux;
		}
		return sum;
	}

	public static int arithmeticProgression(int limit) {
		final int rs = 13;
		int sum = 0, initialT = 5;

		while (initialT <= limit) {
			sum = sum + initialT;
			initialT += rs;
		}
		return sum;
	}

	public static int geometricProgression(int length) {
		int sum = 0, count = 0, initialT = 3, rs = 2;

		while (count < length) {
			sum += initialT;
			initialT *= rs;
			count++;
		}

		return sum;
	}
}