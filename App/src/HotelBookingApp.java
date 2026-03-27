public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection\n");

        // Assume this came from UC6 allocation
        String reservationId = "Single-1";

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500.0);
        AddOnService spa = new AddOnService("Spa", 1000.0);
        AddOnService pickup = new AddOnService("Airport Pickup", 80.0);

        // Manager
        AddOnServiceManager serviceManager = new AddOnServiceManager();

        // Attach services
        serviceManager.addService(reservationId, breakfast);
        serviceManager.addService(reservationId, spa);
        serviceManager.addService(reservationId, pickup);

        // Calculate total
        double totalCost = serviceManager.calculateTotalServiceCost(reservationId);

        // Output
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}