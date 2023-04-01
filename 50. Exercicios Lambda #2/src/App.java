import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import entities.Employee;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        List<Employee> listEmployee = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("in\\Exercise.csv"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] lineContent = line.split(",");
                listEmployee.add(new Employee(lineContent[0], lineContent[1], Double.parseDouble(lineContent[2])));
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Double averageSalary = listEmployee.stream()
            .map(p -> p.getSalary())
            .reduce(0.0, (p1, p2) -> p1 + p2 / listEmployee.size());

        Stream<String> emailHigherAverage = listEmployee.stream()
            .filter(p -> p.getSalary() > averageSalary)
            .map(p -> p.getEmail());

        Double sumEmployeeM = listEmployee.stream()
            .filter(p -> p.getName().toLowerCase().charAt(0) == 'b')
            .map(p -> p.getSalary())
            .reduce(0.0, (p1, p2) -> p1 + p2);

        System.out.println("Email of people whose salary is more than $" + String.format("%.2f", averageSalary));
        emailHigherAverage.forEach(System.out::println);

        System.out.println();

        System.out.println("Sum of salary of people whose name starts with 'B': $" + String.format("%.2f", sumEmployeeM));

        System.out.println();

    }
}
