package application;

public class Executer {

	public static void main(String args[]) {

		int[] aux = Vectors.ages();
		
		for (int i = 0; i < aux.length; i++) {
			Printer.print(aux[i]);
		}
	}
}
