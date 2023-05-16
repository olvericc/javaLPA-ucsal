package application;

public class Structure {
	
	/**
	 * making a bi-dimensional vect
	 * @return
	 */
	public static int[][] sequences() {
		int[][] vectBD = new int[3][3];
		
		vectBD[0][0] = 10;
		vectBD[1][1] = 20;
		vectBD[1][2] = 28;
		
		return vectBD;
	}
	
	public static String[] hidenWords(int size) {
		String[] words = new String[10];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = "\nstudent number: " + (i + 1);
		}
		
		return words;
		
	}
	
	public static int[] sequence(int size) {
		int[] vect = new int[size];
		
		for (int i = 0, v = 2; i < vect.length; i++) {
			vect[i] = v;
			v += 2;
		}
		
		return vect;
	}
	
	public static int[] obtainAges(int size) {
		int[] ages = new int[size];
		
		ages[1] = 22;
		ages[4] = 21;
		ages[0] = 20;
		ages[3] = 23;
		ages[2] = 28;
		
		return ages;
	}

}
