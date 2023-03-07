package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.Exceptions;

public class Reservation {

    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return this.checkIn;
    }

    public Date getCheckOut() {
        return this.checkOut;
    }

    @Override
    public String toString() {
        return "Reservation: Room " + getRoomNumber() + 
        ", check-in: " + dFormat.format(getCheckIn()) + 
        ", check-out: " + dFormat.format(getCheckOut()) +
        ", " + duration() + "nights"; 
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws Exceptions{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new Exceptions("Reservation dates for updates must be future dates!");
        }
        if (!checkOut.after(checkIn)) {
            throw new Exceptions("Check-out date must be after check-in date!");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}