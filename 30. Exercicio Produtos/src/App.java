import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import products.ImportedProduct;
import products.*;
import products.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> prodList = new ArrayList<Product>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data %n", (i + 1));
            System.out.print("Comum, used or imported? (c/u/i): ");
            sc.nextLine();
            char type = sc.nextLine().charAt(0);
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double pPrice = sc.nextDouble();

            if (type == 'c') {
                Product prod = new Product(pName, pPrice);
                prodList.add(prod);
            } else if (type == 'u') {
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                sc.nextLine();
                String sDate = sc.nextLine();
                Date fDate = dFormat.parse(sDate);
                Product prod = new UsedProduct(pName, pPrice, fDate);
                prodList.add(prod);
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                Double cFee = sc.nextDouble();
                Product prod = new ImportedProduct(pName, pPrice, cFee);
                prodList.add(prod);
            }

        }

        System.out.println("Price Tags: ");
        System.out.println();
        for (Product p : prodList) {
            System.out.println(p.priceTag());
        }

        sc.close();

    }
}
