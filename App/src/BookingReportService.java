/**
 * CLASS: BookingReportService
 *
 * Generates reports from booking history
 *
 * @version 8.0
 */

import java.util.List;

public class BookingReportService {

    /**
     * Generate simple report
     */
    public void generateReport(BookingHistory history) {

        System.out.println("Booking History Report\n");

        List<Reservation> reservations = history.getConfirmedReservations();

        for (Reservation r : reservations) {
            System.out.println(
                    "Guest: " + r.getGuestName() +
                            ", Room Type: " + r.getRoomType()
            );
        }
    }
}