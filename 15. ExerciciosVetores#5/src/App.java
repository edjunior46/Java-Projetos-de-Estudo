import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja digitar?: ");
        double[] vetorNum = new double[sc.nextInt()];

        double maiorNum = 0.0;
        int maiorPos = 0;


        for (int i = 0; i < vetorNum.length; i++) {
            System.out.println();
            System.out.printf("Digite o %dº número: ", (i + 1));
            vetorNum[i] = sc.nextDouble();

            if (vetorNum[i] > maiorNum) {
                maiorNum = vetorNum[i];
                maiorPos = i;
            }
        }

        System.out.println();
        System.out.printf("%.2f é o maior número e está na posição %d %n%n", maiorNum, (maiorPos + 1));

        sc.close();

    }
}
