package application;

public class Executer {

	public static void main(String[] args) {
		
		int[] ages = Structure.obtainAges(10);	
		
		for (int i = 0; i < ages.length; i++) {
			Printer.print(ages[i] + " ");
		}
		
		System.out.println();
		
		String[] words = Structure.hidenWords(10);
		
		for (int i = 0; i < words.length; i++) {
			Printer.print(words[i] + " ");
		}
		
		System.out.println();
		
		int[][] bidimensional = Structure.sequences();
		
		for (int i = 0; i < bidimensional.length; i++) {
			for (int j = 0; j < bidimensional[1].length; j++) {
				System.out.print(bidimensional[i][j] + " | ");
			}
			System.out.println();
		}
		
	}

}
