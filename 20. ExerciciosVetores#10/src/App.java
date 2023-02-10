import java.util.Scanner;

import entities.Alunos;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos que deseja registrar: ");
        Alunos[] arrAlunos = new Alunos[sc.nextInt()];

        for (int i = 0; i < arrAlunos.length; i++) {
            System.out.println();
            System.out.printf("Digite o nome do %d° aluno: ", (i + 1));
            String nome = sc.next();

            System.out.printf("Digite a nota do primeiro semestre: ");
            double[] notas = new double[2];
            notas[0] = sc.nextDouble();
            
            System.out.printf("Digite a nota do segundo semestre: ");
            notas[1] = sc.nextDouble();
            arrAlunos[i] = new Alunos(nome, notas);
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");
        System.out.println(Alunos.obterAprovados(arrAlunos));

        sc.close();

    }
}
