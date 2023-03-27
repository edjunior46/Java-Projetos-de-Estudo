import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import taxServices.BrazilTaxServices;
import taxServices.RentalServices;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

        System.out.println("Enter invoice data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Withdraw: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dFormat);
        System.out.print("Return: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dFormat);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxServices());

        rentalServices.processInvoice(carRental);

        System.out.println("Invoice: ");
        System.out.println("Basic payment: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: $" + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: $" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();

    }
}
