/**
 * CLASS: BookingHistory
 *
 * Use Case 8: Booking History & Reporting
 *
 * Stores confirmed reservations in order
 *
 * @version 8.0
 */

import java.util.*;

public class BookingHistory {

    // List to store confirmed bookings
    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    /**
     * Add confirmed reservation
     */
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    /**
     * Get all reservations
     */
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}