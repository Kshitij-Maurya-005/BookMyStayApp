/**
 * CLASS: ReservationValidator
 *
 * Validates booking inputs before processing
 *
 * @version 9.0
 */

import java.util.*;

public class ReservationValidator {

    // Allowed room types
    private static final Set<String> VALID_ROOM_TYPES =
            new HashSet<>(Arrays.asList("Single", "Double", "Suite"));

    /**
     * Validate booking input
     */
    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        // Validate guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // Normalize input
        roomType = roomType.substring(0, 1).toUpperCase()
                + roomType.substring(1).toLowerCase();

        // Validate room type
        if (!VALID_ROOM_TYPES.contains(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Validate availability
        int available = inventory.getAvailability(roomType);

        if (available <= 0) {
            throw new InvalidBookingException(
                    "No available rooms for selected type."
            );
        }
    }
}