import java.util.Scanner;

import entities.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que deseja registrar: ");
        Pessoas[] arrPessoas = new Pessoas[sc.nextInt()];

        for (int i = 0; i < arrPessoas.length; i++) {

            System.out.println();
            System.out.printf("Digite o nome da %dª pessoa: ", (i + 1));
            String nome = sc.next();

            System.out.printf("Digite o gênero da %dª pessoa (m/f): ", (i + 1));
            char genero = sc.next().charAt(0);

            System.out.printf("Digite a altura da %dª pessoa: ", (i + 1));
            double altura = sc.nextDouble();

            arrPessoas[i] = new Pessoas(nome, genero, altura);
        }

        System.out.println();
        System.out.println("Maior altura: " + Pessoas.obterMaiorAltura(arrPessoas));

        System.out.println();
        System.out.println("Menor altura: " + Pessoas.obterMenorAltura(arrPessoas));

        System.out.println();
        System.out.println("Media da altura das mulheres: " + Pessoas.obterMediaMulheres(arrPessoas));

        System.out.println();
        System.out.println("Quantidade de homens: " + Pessoas.obterQtdeHomens(arrPessoas));

        sc.close();

    }
}
