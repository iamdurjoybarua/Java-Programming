import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airplane {

    private String flightNumber;
    private String destination;
    private LocalTime departureTime;
    private boolean isDelayed;
    private LocalTime delayDuration; // If delayed, how long is the delay

    // Constructor to initialize the Airplane object
    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false; // Initially, the flight is not delayed
        this.delayDuration = LocalTime.of(0, 0); // Initial delay is zero
    }

    /**
     * Gets the flight number of the airplane.
     *
     * @return The flight number.
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Gets the destination of the airplane.
     *
     * @return The destination.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Gets the scheduled departure time of the airplane.
     *
     * @return The departure time.
     */
    public LocalTime getDepartureTime() {
        return departureTime;
    }

    /**
     * Checks if the flight is delayed.
     *
     * @return True if the flight is delayed, false otherwise.
     */
    public boolean isDelayed() {
        return isDelayed;
    }

    /**
     * Gets the duration of the delay, if any.
     *
     * @return The delay duration as a LocalTime object (e.g., 01:30 for 1 hour 30 minutes delay).
     * Returns LocalTime.of(0, 0) if the flight is not delayed.
     */
    public LocalTime getDelayDuration() {
        return delayDuration;
    }

    /**
     * Sets the delay status of the flight.
     *
     * @param delayed True if the flight is delayed, false otherwise.
     * @param delay   The duration of the delay as a LocalTime object (e.g., LocalTime.of(1, 0) for 1 hour).
     * This parameter is only considered if 'delayed' is true.
     */
    public void setDelayed(boolean delayed, LocalTime delay) {
        this.isDelayed = delayed;
        if (delayed && delay != null) {
            this.delayDuration = delay;
        } else {
            this.delayDuration = LocalTime.of(0, 0); // Reset delay if not delayed or no delay provided
        }
    }

    /**
     * Gets the current status of the flight.
     *
     * @return A string describing the flight status (e.g., "Flight BA249 to London is scheduled to depart at 10:00.").
     */
    public String getFlightStatus() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String status = "Flight " + flightNumber + " to " + destination + " is scheduled to depart at " + departureTime.format(formatter) + ".";
        if (isDelayed) {
            status += " This flight is delayed by " + delayDuration.format(DateTimeFormatter.ofPattern("HH:mm")) + ".";
        } else {
            status += " This flight is currently on time.";
        }
        return status;
    }

    public static void main(String[] args) {
        // Create an Airplane object
        LocalTime departure1 = LocalTime.of(10, 0);
        Airplane flight1 = new Airplane("BA249", "London", departure1);
        System.out.println(flight1.getFlightStatus());

        // Create another Airplane object
        LocalTime departure2 = LocalTime.of(14, 30);
        Airplane flight2 = new Airplane("EK502", "Dubai", departure2);
        System.out.println(flight2.getFlightStatus());

        // Delay the second flight
        LocalTime delayTime = LocalTime.of(1, 15);
        flight2.setDelayed(true, delayTime);
        System.out.println(flight2.getFlightStatus());

        // Check if the first flight is delayed
        System.out.println("Is " + flight1.getFlightNumber() + " delayed? " + flight1.isDelayed());

        // Check the delay duration of the second flight
        System.out.println("Delay duration for " + flight2.getFlightNumber() + ": " + flight2.getDelayDuration().format(DateTimeFormatter.ofPattern("HH:mm")));

        // Set the second flight back to on time
        flight2.setDelayed(false, LocalTime.of(0, 0));
        System.out.println(flight2.getFlightStatus());
    }
}