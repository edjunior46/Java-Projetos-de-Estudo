import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual dia da semana é hoje?");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda!");
                break;
            case 3:
                System.out.println("Hoje é terça!");
                break;
            case 4:
                System.out.println("Hoje é quarta!");
                break;
            case 5:
                System.out.println("Hoje é quinta!");
                break;
            case 6:
                System.out.println("Hoje é sexta!");
                break;
            case 7:
                System.out.println("Hoje é sábado!");
                break;
            default:
                System.out.println("Insira um valor de 1 a 7!");
                break;
        }
    }
}