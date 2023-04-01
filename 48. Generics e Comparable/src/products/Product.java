package products;

public class Product implements Comparable<Product> {
    
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + ", " + getPrice() + "\n";
    }

    @Override
    public int compareTo(Product other) {
        return getPrice().compareTo(other.getPrice());
    }

    /*
     * compareTo é um método pertencente à interface CompareTo
     * esse método me retorna um int de acordo com os objetos comparados
     * caso o retorno seja positivo, meu objeto é maior que meu parâmetro
     * caso o retorno seja negativo, meu objeto é menor que meu parâmetro
     * caso o retorno seja 0, meu objeto é igual ao meu parâmetro
     */

}
