import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Faça um programa para ler dois valores inteiros, e depois mostrar na tela
        * a soma desses números com uma mensagem explicativa.
        */
        Scanner sc = new Scanner(System.in);
        /*
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Soma = " + (a + b));
        */

        /*
        * Faça um programa para ler o valor do raio de um círculo, e depois
        * mostrar o valor da área deste círculo com quatrocasas decimais
        */

        /*
        double raio, area, pi = 3.14159;
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("Área do círculo = " + "%.4f", area);
        */

        /*
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.println("Diferença = " + ((a * b) - (c * d)));
        */

        /*
        double funcNum, horasTrab, valorHora;
        funcNum = sc.nextDouble();
        sc.nextLine();
        horasTrab = sc.nextDouble();
        sc.nextLine();
        valorHora = sc.nextDouble();

        System.out.printf("Funcionário número: " + "%.0f" + "%n", funcNum);
        System.out.printf("Salário Total: R$" + "%.2f", (valorHora * horasTrab));
        */

        int pec1Cod, pec1Num, pec2Cod, pec2Num;
        double pec1Val, pec2Val;

        pec1Cod = sc.nextInt();
        pec1Num = sc.nextInt();
        pec1Val = sc.nextDouble();

        pec2Cod = sc.nextInt();
        pec2Num = sc.nextInt();
        pec2Val = sc.nextDouble();

        System.out.printf("Valor total: R$" + "%.2f", ((pec1Num * pec1Val) + (pec2Num * pec2Val)));


        sc.close();
    }
}