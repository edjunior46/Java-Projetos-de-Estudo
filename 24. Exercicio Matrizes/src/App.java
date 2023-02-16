import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite a quantidade de linhas e colunas da matriz: ");
        int qtde = sc.nextInt();
        int[][] matriz = new int[qtde][qtde];

        for (int i = 0; i < qtde; i++) {
            for (int j = 0; j < qtde; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Diagonal principal:");

        for (int i = 0; i < qtde; i++) {
            for (int j = 0; j < qtde; j++) {
                if (i == j) {
                    System.out.print(" " + matriz[i][j]);
                }
            }
        }

        int qtdeNeg = 0;
        for (int i = 0; i < qtde; i++) {
            for (int j = 0; j < qtde; j++) {
                if (matriz[i][j] < 0) {
                    qtdeNeg++;
                }
            }
        }

        System.out.println();
        System.out.println("Quantida de de números negativos: " + qtdeNeg);
        
        sc.close();

    }
}
