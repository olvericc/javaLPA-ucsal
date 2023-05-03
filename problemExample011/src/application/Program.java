package application;

public class Program {

	public static void main(String[] args) {

		int length = 30,
				half = length/2,
				limit = 100,
				result;

		result = Sequential.fibonacci(length);
		Printer.print("fibonacci: " + result);
		
		result = Sequential.arithmeticProgression(limit);
		Printer.print("arithmetic progression: " + result);
		
		result = Sequential.geometricProgression(half);
		Printer.print("geometric progression: " + result);

	}

}
