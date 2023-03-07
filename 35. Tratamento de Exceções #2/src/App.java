import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entities.Reservation;
import exceptions.Exceptions;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            Integer roomNumber = sc.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy): ");
            Date checkIn = dFormat.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            Date checkOut = dFormat.parse(sc.next());
        
            Reservation room = new Reservation(roomNumber, checkIn, checkOut);

            System.out.println(room);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-In date: (dd/MM/yyyy): ");
            checkIn = dFormat.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = dFormat.parse(sc.next());

            room.updateDates(checkIn, checkOut);

            System.out.println(room);

        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();

    }
}
