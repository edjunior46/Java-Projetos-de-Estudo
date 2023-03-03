import java.util.Scanner;
import entities.*;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de contribuintes: ");
        int n = sc.nextInt();

        List<Pessoa> listPessoa = new ArrayList<Pessoa>();
    
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do contribuinte #%d %n", (i + 1));
            System.out.print("Pessoa física ou jurídica? (f/j): ");
            sc.nextLine();
            char type = sc.nextLine().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();

            if (type == 'f') {
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();
                listPessoa.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (type == 'j') {
                System.out.print("Número de funcionários: ");
                Integer numFunc = sc.nextInt();
                listPessoa.add(new PessoaJuridica(nome, rendaAnual, numFunc));
            }
        }

        System.out.println();
        System.out.println("Impostos: ");

        for (Pessoa p : listPessoa) {
            System.out.println(p.getNome() + ", valor do imposto: $" + p.imposto());
        }

        sc.close();

    }
}
