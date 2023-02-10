import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int userMinutes;
        double precoFinal = 50.00;

        System.out.println("Quantos minutos você utilizou do seu plano?");
        userMinutes = sc.nextInt();

        if (userMinutes <= 100) {
            System.out.printf("Sua fatura é de: %.2f", precoFinal);
        } else {
            System.out.printf("Sua fatura é de: %.2f", precoFinal + ((userMinutes - 100) * 2));
        }

        sc.close();

    }
}