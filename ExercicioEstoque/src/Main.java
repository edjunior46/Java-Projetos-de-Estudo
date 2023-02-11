import java.util.Scanner;
import entities.products;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        products product = new products();

        System.out.println("Digite o nome do produto: ");
        product.produtoNome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        product.produtoPreco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        product.produtoQtde = sc.nextInt();

        System.out.println();
        System.out.printf("Produto: %s%n" + "Preço do produto: R$%.2f%n" + "Quantidade do produto: %d%n" + "Estoque total: R$%.2f%n", product.produtoNome, product.produtoPreco, product.produtoQtde, product.estoqueTotal());

        System.out.println("Deseja adicionar quantos produtos?: ");
        product.estoqueAdd(sc.nextInt());
        System.out.printf("Nova quantidade de produtos: %d%n" + "Estoque total: R$%.2f%n", product.produtoQtde, product.estoqueTotal());
        System.out.println("Deseja remover quantos produtos?: ");
        product.estoqueRemove(sc.nextInt());
        System.out.printf("Nova quantidade de produtos: %d%n" + "Estoque total: R$%.2f%n", product.produtoQtde, product.estoqueTotal());

        sc.close();

    }
}