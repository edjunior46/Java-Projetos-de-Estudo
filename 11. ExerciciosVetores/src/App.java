import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números inteiros deseja fazer a leitura: ");
        int[] vect = new int[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Números negativos: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }
}
