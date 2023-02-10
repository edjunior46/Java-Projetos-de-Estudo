import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x, y, z;
        double a;
        int b;

        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();
        a = sc.nextDouble();
        b = sc.nextInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}