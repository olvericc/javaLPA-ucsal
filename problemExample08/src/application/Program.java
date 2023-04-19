package application;

public class Program {

	public static void main(String[] args) {
		int i = 1;
		for (; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("end " + i);
		
		
		final int QT = 20;
		int it, rz;
		for (it = 2, rz = 4; it < QT; it += rz) {
			System.out.print(it + " ");
		}
		System.out.println("end ");
		
		final int QT2 = 20;
		for (int ti2 = 2, rz2 = 4; ti2 < QT; ti2 += rz2) {
			System.out.print(ti2 + " ");
		}
		System.out.println("end ");
		
		
		// fibonacci
		
		final int QT3 = 10;
		for (int a = 0, b = 1, aux = a + b, count = 0 ; count < QT3;) {
			if (a % 2 != 0) {
				System.out.print(a + " ");
				count++;
			}
			aux = a + b;
			a = b;
			b = aux;
		}
		System.out.println();
		System.out.print("end");
		
		
		
	}

}
