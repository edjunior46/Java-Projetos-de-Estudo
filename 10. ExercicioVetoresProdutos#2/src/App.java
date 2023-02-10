import java.util.Scanner;
import products.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que deseja registrar: ");
        Produtos[] arrProd = new Produtos[sc.nextInt()];

        for (int i = 0; i < arrProd.length; i++) {
            System.out.println();
            System.out.printf("Digite o nome do produto %d: ", i + 1);
            sc.nextLine();
            String name = sc.nextLine();

            System.out.printf("Digite o preço do produto %d: ", i + 1);
            double price = sc.nextDouble();

            arrProd[i] = new Produtos(name, price);
        }

        System.out.println();
        System.out.printf(Produtos.convertendo(arrProd));

        System.out.println();
        System.out.printf("Média de preço dos produtos: R$%.2f%n", Produtos.calcMedia(arrProd));

        sc.close();

    }
}
