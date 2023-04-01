import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

import products.Product;

public class App {
    public static void main(String[] args) {

        List<Product> listProducts = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("in\\Exercise.csv"))) {
            String line = reader.readLine();
            while(line != null) {
                String[] lineContent = line.split(",");
                listProducts.add(new Product(lineContent[0], Double.parseDouble(lineContent[1])));
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Double average = listProducts.stream()
        .map(p -> p.getPrice())
        .reduce(0.0, (x, y) -> x + y) / listProducts.size();

        Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> descendingNames = listProducts.stream()
            .filter(p -> p.getPrice() < average)
            .map(p -> p.getName())
            .sorted(comp.reversed())
            .collect(Collectors.toList());

        System.out.println(average);
        descendingNames.forEach(System.out::println);

    }

}
