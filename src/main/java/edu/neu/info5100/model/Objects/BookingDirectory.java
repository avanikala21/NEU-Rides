package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class BookingDirectory {
    ArrayList<Booking> bookings = new ArrayList<Booking>();

    public BookingDirectory(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean add(Booking booking) {
        return bookings.add(booking);
    }
}
