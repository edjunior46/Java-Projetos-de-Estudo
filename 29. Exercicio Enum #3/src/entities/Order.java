package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    
    private Date moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> listaPedido = new ArrayList<OrderItem>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        listaPedido.add(item);
    }

    public Double total() {
        Double result = 0.0;

        for (OrderItem i : listaPedido) {
            result += i.getPrice() * i.getQuantity();
        }

        return result;
    }

    public String toString() {
        String result = "";

        for (OrderItem i : listaPedido) {
            result += "Product: " + i.getName() + 
            ", " + "Price: $" + i.getPrice() + 
            ", " + "Quantity: " + i.getQuantity() + 
            ", " + "Subtotal: $" + i.subTotal() + 
            "\n";
        }

        return result;
    }


}
