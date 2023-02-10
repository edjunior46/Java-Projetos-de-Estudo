import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas posições terão os vetores?: ");
        double[] vectA = new double[sc.nextInt()];

        System.out.println();
        System.out.println("Digite os valores do Vetor A: ");

        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextDouble();
        }

        double[] vectB = new double[vectA.length];

        System.out.println();
        System.out.println("Digite os valores do Vetor B: ");

        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Soma: ");

        for (int i = 0; i < vectA.length; i++) {
            System.out.println(vectA[i] + vectB[i]);
        }
        
        sc.close();

    }
}
