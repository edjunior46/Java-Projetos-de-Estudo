import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a ser lida: ");
        int[] arrPares = new int[sc.nextInt()];

        for (int i = 0; i < arrPares.length; i++) {
            System.out.printf("Digite o %dº número: %n", (i + 1));
            int num = sc.nextInt();
            if (num % 2 == 0) {
                arrPares[i] = num;
            }
        }

        System.out.println(toString(arrPares));

        sc.close();

    }

    public static String toString(int[] arrPares) {
        String result = "";

        for (int i = 0; i < arrPares.length; i++) {
            if (arrPares[i] != 0) {
                result += arrPares[i]
                + ", ";
            }
        }

        return result;
    }

    
}
