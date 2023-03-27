package entities;

import java.time.LocalDateTime;

public class CarRental {
    
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return this.start;
    }

    public LocalDateTime getFinish() {
        return this.finish;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


}
