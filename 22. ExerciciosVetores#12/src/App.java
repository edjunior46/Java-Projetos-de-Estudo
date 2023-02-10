import java.util.Scanner;

import entities.Pensionato;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Pensionato[] arrQuartos = new Pensionato[10];

        System.out.print("Quantos quartos deseja alugar?: ");
        int qtde = sc.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println();
            System.out.print("Digite o nome do estudante: ");
            String nome = sc.next();
            System.out.print("Digite o email do estudante: ");
            String email = sc.next();

            arrQuartos[i] = new Pensionato(nome, email);
        }

        System.out.println();
        System.out.println(Pensionato.obterRelatorio(arrQuartos));

        sc.close();

    }
}
