package ucsal;

public class Executor {

    public static void main(String[] args) {

        int razao = 3;
        int tamanho = 5;
        int valorInicial = 2;

        int[] result = Solucao.obterArray01(tamanho, valorInicial, razao);

        for (int i = 0; i < result.length; i++) {
            Impressao.imprimir(result[i]);
        }

        System.out.println();
        System.out.println();

        int qtdLinhas = 6;
        int qtdColunas = 5;

        int[][] result2 = Solucao.obterArray02(qtdLinhas, qtdColunas);
        Impressao.imprimirArray(result2);

        System.out.println();

        int linha = 5;
        int coluna = 3;
        int termoInicial = 1;
        int razao2 = 4;

        int[][] result3 = Solucao.obterArray03(linha, coluna, termoInicial, razao2);
        Impressao.imprimirArray(result3);

        System.out.println();

        int[][] primeiroArray = { { 1, 2}, {3, 4} };
        int[][] segundoArray = { { 5, 6}, {7, 8} };

        int[][] result4 = Solucao.obterArray04(primeiroArray, segundoArray);
        Impressao.imprimirArray(result4);

    }
}
