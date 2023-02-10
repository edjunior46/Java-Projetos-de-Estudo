import java.util.Scanner;
import entities.Altura;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pessoas que você deseja ler a altura: ");
        int qtdeAlturas = sc.nextInt();

        double[] vect = new double[qtdeAlturas];

        for (int i = 0; i < qtdeAlturas; i++) {
            System.out.printf("Digite a altura da pessoa %d%n", (i + 1));
            vect[i] = sc.nextDouble();
        }

        System.out.printf("A média de altura é de : %.2f%n", Altura.calcularAltura(vect));

        sc.close();

    }
}
