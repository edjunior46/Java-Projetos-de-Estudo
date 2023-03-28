import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import contractServices.ContractService;
import contractServices.PaypalService;
import entities.Contract;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (MM/dd/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);
        ContractService service = new ContractService(new PaypalService());

        System.out.print("Enter the number of installments: ");
        int months = sc.nextInt();
        
        service.processContract(contract, months);

        System.out.println();
        System.out.println("Installments values: ");
        System.out.println(contract.getInstallments());

        sc.close();

    }
}
