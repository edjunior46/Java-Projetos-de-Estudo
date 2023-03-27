package taxServices;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalServices {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxServices taxService;

    public RentalServices() {

    }

    public RentalServices(Double pricePerHour, Double pricePerDay, TaxServices taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return this.pricePerHour;
    }

    public Double getPricePerDay() {
        return this.pricePerDay;
    }
    
    public void processInvoice(CarRental carRental) {

        double hours = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes() / 60;

        double basicPayment;
        
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }
        
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
    
}
