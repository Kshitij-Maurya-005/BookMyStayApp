import java.util.Scanner;

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("Booking Validation\n");

        Scanner scanner = new Scanner(System.in);

        // Components
        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        try {
            // Input
            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter room type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();

            // Validate
            validator.validate(guestName, roomType, inventory);

            // If valid → create reservation
            Reservation reservation = new Reservation(guestName, roomType);

            // Add to queue
            bookingQueue.addRequest(reservation);

            System.out.println("Booking request accepted successfully!");

        } catch (InvalidBookingException e) {

            // Graceful failure
            System.out.println("Booking failed: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}