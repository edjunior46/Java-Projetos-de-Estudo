import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.*;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String cName = sc.nextLine();
        System.out.print("Email: ");
        String cEmail = sc.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        String sDate = sc.nextLine();
        Date cDate = dFormat.parse(sDate);

        Client client = new Client(cName, cEmail, cDate);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String oStatus = sc.nextLine();
        System.out.print("How many itens to this order?: ");
        Integer oItems = sc.nextInt();

        Date moment = new Date();

        Order pedido = new Order(moment, OrderStatus.valueOf(oStatus), client);

        for (int i = 0; i < oItems; i++) {
            System.out.println();
            System.out.printf("Enter the %d# item data\n", (i + 1));
            System.out.print("Product name: ");
            sc.nextLine();
            String oName = sc.nextLine();
            System.out.print("Product price: ");
            Double oPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer oQtt = sc.nextInt();

            Product produto = new Product(oName, oPrice);
            OrderItem item = new OrderItem(produto.getName(), oQtt, produto.getPrice());
            pedido.addItem(item);
        }

        System.out.println();
        System.out.println("Order Sumary: ");
        System.out.println("Order moment: " + dFormat2.format(pedido.getMoment()));
        System.out.println("Order Status: " + pedido.getStatus());
        System.out.println("Client: " + pedido.getClient());
        System.out.println("Order items: ");
        System.out.println(pedido);
        System.out.println("Total price: $" + pedido.total());
        

        sc.close();

    }
}
