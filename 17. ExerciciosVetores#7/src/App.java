import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double result = 0;

        System.out.print("Digite o número de posições do vetor: ");
        double[] arrNum = new double[sc.nextInt()];

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println();
            System.out.printf("Digite o %d número: ", (i + 1));
            arrNum[i] = sc.nextDouble();
            result += arrNum[i];
        }

        System.out.println();
        System.out.println("Média dos valores: " + (result / arrNum.length));

        System.out.println();
        System.out.println("Valores abaixo da média: ");
    
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < result / arrNum.length) {
                System.out.println(arrNum[i]); 
            }
        }

        sc.close();

    }
}
