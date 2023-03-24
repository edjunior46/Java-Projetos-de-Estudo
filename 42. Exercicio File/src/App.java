import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import products.Products;

public class App {
    public static void main(String[] args) throws Exception {

        List<Products> products = new ArrayList<>();
        File file = new File("src\\exercicio\\summary.csv");
        File newFile = new File("src\\exercicio\\out.csv");

        try (BufferedReader bR = new BufferedReader(new FileReader(file))) {
            
            String fileLine = bR.readLine();

            while (fileLine != null) {
                String[] prodInfo = fileLine.split(", ");
                products.add(new Products(prodInfo[0], Double.parseDouble(prodInfo[1]), Integer.parseInt(prodInfo[2])));
                fileLine = bR.readLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedWriter bW = new BufferedWriter(new FileWriter(newFile))) {

            for (Products p : products) {
                bW.write(p.getName() + ", " + String.format("%.2f\n", p.total()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }        

    }
}
