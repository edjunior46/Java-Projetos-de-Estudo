package entities;

public class OrderItem {
    
    private String name;
    private Integer quantity;
    private Double price;

    public OrderItem() {

    }

    public OrderItem(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal() {
        return this.price * this.quantity;
    }

}
