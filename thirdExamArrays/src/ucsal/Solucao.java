package ucsal;

public class Solucao {

    // problema número 1
    public static int[] obterArray01 (int tam, int ini, int raz) {

        int[] vet = new int[tam];

        vet[0] = ini;

        for (int i = 1; i < tam; i++) {
            vet[i] = vet[i - 1] * raz;
        }
        return vet;
    }

    // problema número 2

    public static int[][] obterArray02 (int linha, int coluna) {

        int[][] array = new int[linha][coluna];

        int valor1 = 0;
        int valor2 = 1;
        int aux;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                array[i][j] = valor1;
                aux = valor1 + valor2;
                valor1 = valor2;
                valor2 = aux;
            }
        }
        return array;
    }

    // problema número 3

    public static int[][] obterArray03 (int linha, int coluna, int termoInicial, int razao) {

        int[][] array2 = new int[linha][coluna];

        int result = termoInicial;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                array2[i][j] = result;
                result += razao;
            }
        }
        return array2;
    }

    // problema número 4

    public static int[][] obterArray04 (int[][] n1, int[][] n2) {

        int linhasN1 = n1.length;
        int colunasN1 = n1[0].length;
        int linhasN2 = n2.length;
        int colunasN2 = n2[0].length;

        if (colunasN1 != colunasN2 || linhasN2 != linhasN1) {

            int[][] result4 = new int[linhasN1][colunasN1];

            for (int i = 0; i < linhasN1; i++) {
                for (int j = 0; j < linhasN2; j++) {
                    result4[i][j] = 0;
                }
            }
            return result4;
        }

        int[][] result5 = new int[linhasN1][colunasN1];

        for (int i = 0; i < linhasN1; i++) {
            for (int j = 0; j < colunasN1; j++) {
                result5[i][j] = n1[i][j] + n2[i][j];
            }
        }
        return result5;
    }
}