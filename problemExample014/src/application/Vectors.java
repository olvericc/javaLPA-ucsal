package application;

public class Vectors {
	
	public static int[] ages() {
		
		int[] aux = Vectors.ages();
		
		for (int i = 0, var = 2; i < aux.length; i++) {
			aux[i] = var;
			var += 2;
		}
		return aux;
	}
	
}