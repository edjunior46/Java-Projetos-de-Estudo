import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Set<Integer> studentsList = new HashSet<>();

        System.out.print("How many students for course A?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer studentId = sc.nextInt();
            if (!studentsList.contains(studentId)) {
                studentsList.add(studentId);
            }
        }

        System.out.print("How many students for course B?: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer studentId = sc.nextInt();
            if (!studentsList.contains(studentId)) {
                studentsList.add(studentId);
            }
        }

        System.out.print("How many students for course C?: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer studentId = sc.nextInt();
            if (!studentsList.contains(studentId)) {
                studentsList.add(studentId);
            }
        }

        System.out.println("Total students: " + studentsList.size());

        sc.close();

    }
}
