import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import products.Products;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 1700.00));
        list.add(new Products("Smartphone", 900.00));
        list.add(new Products("Refrigerator", 2000.00));

        list.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));

        for (Products p : list) {
            System.out.println(p);
        }

        sc.close();

    }
}
