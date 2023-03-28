package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate dueDate;
    private double amount;

    private Contract contract;

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public double getAmount() {
        return this.amount;
    }

    public Contract getContract() {
        return this.contract;
    }

    @Override
    public String toString() {
        return getDueDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + " - $" + String.format("%.2f\n", getAmount());
    }
    
}
