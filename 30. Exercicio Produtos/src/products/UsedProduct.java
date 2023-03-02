package products;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return getName() + " (used) $" + String.format("%.2f", getPrice()) 
        + " (Manufacture Date: " + dFormat.format(getManufactureDate()) + ") \r\n";
    }
    
}
