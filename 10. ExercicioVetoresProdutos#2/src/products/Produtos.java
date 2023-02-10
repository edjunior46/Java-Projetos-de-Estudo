package products;

public class Produtos {
    
    private String prodName;
    private double prodPrice;

    public Produtos(String prodName, double prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public String getName() {
        return prodName;
    }

    public double getPrice() {
        return prodPrice;
    }

    public void setName(String newName) {
        this.prodName = newName;
    }

    public void setPrice(double newPrice) {
        this.prodPrice = newPrice;
    }

    public static String convertendo(Produtos[] arrProd) {

        String result = "";

        for (int i = 0; i < arrProd.length; i++) {
            result += "Produto " +
            (i + 1) +
            ": " +
            arrProd[i].prodName +
            " - R$" +
            String.format("%.2f", arrProd[i].prodPrice) +
            "%n";
        }

        return result;
    }

    public static double calcMedia(Produtos[] arrProd) {
        double result = 0;

        for (int i = 0; i < arrProd.length; i++) {
            result += arrProd[i].prodPrice;
        }

        return result / arrProd.length;
    }

}
