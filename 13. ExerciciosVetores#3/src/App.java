import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que serão registradas: ");
        int qtde = sc.nextInt();

        Pessoas[] arrPessoas = new Pessoas[qtde];

        for (int i = 0; i < qtde; i++) {
            System.out.println();
            System.out.printf("Digite o nome da %dº pessoa: ", (i + 1));
            sc.nextLine();
            String name = sc.next();
            
            System.out.printf("Digite a idade da %dº pessoa: ", (i + 1));
            sc.nextLine();
            int idade = sc.nextInt();

            System.out.printf("Digite a altura da %dº pessoa: ", (i + 1));
            sc.nextLine();
            double altura = sc.nextDouble();

            arrPessoas[i] = new Pessoas(name, idade, altura);
        }

        System.out.println();
        System.out.printf("Altura média: %.2f %n", Pessoas.obterMedia(arrPessoas));
        
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + String.format("%.2f", Pessoas.obterPorcentagem(arrPessoas)) + "%");
        Pessoas.obterNomes(arrPessoas);

        System.out.println();


        sc.close();

    }
}
