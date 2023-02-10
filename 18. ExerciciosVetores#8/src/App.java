import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de posições do vetor: ");
        double[] arrNum = new double[sc.nextInt()];

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println();
            System.out.printf("Digite o %d° número: ", (i + 1));
            arrNum[i] = sc.nextDouble();
        }

        System.out.println();

        double result = 0;
        int numPar = 0;

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] % 2 == 0) {
                result += arrNum[i];
                numPar++;
            } 
        }

        if (numPar != 0) {
            System.out.println("Média dos pares: " + (result / numPar));
        } else {
            System.out.println("Nenhum número par");
        }

        sc.close();

    }
}
