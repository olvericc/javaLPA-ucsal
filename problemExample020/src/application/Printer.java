package application;

public class Printer {

	public static void print(int args) {
		System.out.print(args);
	}
	
	public static void print(String args) {
		System.out.print(args);
	}
	
	public static void printBDVect(int[][] arrayB) {
		final String TRACE = "------------------";
		System.out.println(TRACE);
		for (int i = 0; i < arrayB.length; i++) {
			for (int j = 0; j < arrayB[i].length; j++) {
				System.out.print("| " + (arrayB[i][j] < 10 ? "0" : "") + arrayB[i][j] + " |");
			}
			System.out.println();
			System.out.println(TRACE);
		}
		System.out.println();
	}
	
	public static void printODVect(int[] arrayO) {
		for (int i = 0; i < arrayO.length; i++) {
			Printer.print(arrayO[i] + " | ");
		}
		System.out.println();
	}
	
}
