import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que deseja comparar: ");
        Pessoas[] arrPessoas = new Pessoas[sc.nextInt()];
        
        int maisVelho = 0;

        for (int i = 0; i < arrPessoas.length; i++) {

            System.out.println();
            System.out.printf("Digite o nome da %dª pessoa: ", (i + 1));
            String nome = sc.next();

            System.out.printf("Digite a idade da %dª pessoa: ", (i + 1));
            int idade = sc.nextInt();

            arrPessoas[i] = new Pessoas(nome, idade);

            if (arrPessoas[i].getIdade() >= arrPessoas[maisVelho].getIdade()) {
                maisVelho = i;
            }
        }

        System.out.println();
        System.out.println("Pessoa mais velha: " + arrPessoas[maisVelho].getNome());

        sc.close();
    }
}
