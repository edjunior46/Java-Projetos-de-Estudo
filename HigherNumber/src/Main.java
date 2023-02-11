import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int maior = 0;

        if (x > y && x > z) {
            maior = x;
        } else if (y > x && y > z) {
            maior = y;
        } else if (z > x && z > y) {
            maior = z;
        }

        System.out.println("O maior número é: " + maior);

        sc.close();

    }
}