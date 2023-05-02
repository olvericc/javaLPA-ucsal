package application;

public class Program {

	public static void main(String[] args) {
		int result = Sequentials.fibonacci(30);
		Printer.print("fibonacci: " + result);
		
		result = Sequentials.arithmeticProgression(100);
		Printer.print("arithmetic progression: " + result);
		
		result = Sequentials.geometricProgression(length/2);

	}

}
