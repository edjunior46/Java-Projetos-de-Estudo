import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import products.Product;
import services.CalculationService;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("in\\Exercise.csv"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] splitStrings = line.split(",");
                list.add(new Product(splitStrings[0], Double.parseDouble(splitStrings[1])));
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(list);
        System.out.println();
        
        Product x = CalculationService.max(list);
        System.out.println("Higher price: " + x);

    }
}
