// Define the TrafficLight class
public class TrafficLight {

    // Attributes to store the current color of the traffic light and its duration in seconds
    private String color;
    private int duration;

    // Constructor to initialize the traffic light with a color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light and reset the duration
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + newColor + " for " + newDuration + " seconds.");
    }

    // Method to check if the current color is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the current color is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Method to display the current state of the traffic light
    public void displayStatus() {
        System.out.println("Current color: " + color + ", Duration: " + duration + " seconds");
    }

    // Main method to test the TrafficLight class
    public static void main(String[] args) {
        // Create a TrafficLight object with initial color red and duration 30 seconds
        TrafficLight light = new TrafficLight("red", 30);

        // Display the initial status
        light.displayStatus();

        // Check if the light is red
        if (light.isRed()) {
            System.out.println("Stop! The light is red.");
        }

        // Change the color to green and update the duration
        light.changeColor("green", 45);

        // Display the updated status
        light.displayStatus();

        // Check if the light is green
        if (light.isGreen()) {
            System.out.println("Go! The light is green.");
        }
    }
}
