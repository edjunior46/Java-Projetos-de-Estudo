package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    
    private int number;
    private LocalDate date;
    private double totalValue;

    List<Installment> installments;

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = new ArrayList<>();
    }

    public int getNumber() {
        return this.number;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public double getTotalValue() {
        return this.totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallent(double amount, int months) {
        installments.add(new Installment(getDate().plusMonths(months), amount));
    }
    

}
