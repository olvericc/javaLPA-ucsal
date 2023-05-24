package ucsal;

public class Impressao {

    public static void imprimir(int vet) {
        System.out.print(vet + " ");
    }

    public static void imprimirArray (int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j] < 10 ? "0" : "") + array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
