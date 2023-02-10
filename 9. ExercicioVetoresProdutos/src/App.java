import java.util.Scanner;
import products.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que deseja registrar: ");
        double[] arrPrecos = Produtos.vectPrecos(sc.nextInt());

        for (int i = 0; i < arrPrecos.length; i++) {

            System.out.println();

            System.out.printf("Digite o nome do produto %d: ", i + 1);
            sc.next();

            System.out.printf("Digite o preço do produto %d: ", i + 1);
            arrPrecos[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.printf("O preço médio dos produtos é de R$%.2f%n", Produtos.calcularMedia(arrPrecos));

        sc.close();
        
    }
}
