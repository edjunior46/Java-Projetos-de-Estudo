import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double result = 0;

        System.out.print("Digite a quantidade de números que deseja registrar: ");
        double[] vect = new double[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextDouble();
            result += vect[i];
        }

        System.out.println();
        System.out.print("Valores digitados: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + "  ");
        }

        System.out.println();
        System.out.println();

        System.out.println("A soma dos números é " + result);
        System.out.println("A média dos números é " + (result / vect.length));

        sc.close();

    }
}
