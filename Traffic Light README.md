# Traffic Light Simulation in Java

This repository contains a simple Java program that simulates the behavior of a traffic light. The program defines a `TrafficLight` class with attributes for the current color and the duration for which the light stays in that color.

## Features

* **TrafficLight Class:**
    * Represents a traffic light with attributes for the current `color` (String) and its `duration` (int) in seconds.
    * Includes a constructor to initialize a `TrafficLight` object with a specified color and duration.
    * Provides a `changeColor()` method to update the traffic light's color and its duration, also printing a message indicating the change.
    * Offers `isRed()` and `isGreen()` methods to easily check if the current color of the light is red or green, respectively (case-insensitive comparison).
    * Includes a `displayStatus()` method to print the current color and duration of the traffic light.

* **Main Method:**
    * The `main` method within the `TrafficLight` class demonstrates the basic usage of the `TrafficLight` class.
    * It creates a `TrafficLight` object, initially set to "red" with a duration of 30 seconds.
    * It displays the initial status of the traffic light.
    * It checks if the light is red and prints a corresponding message.
    * It changes the color of the light to "green" with a new duration of 45 seconds.
    * It displays the updated status of the traffic light.
    * It checks if the light is green and prints a corresponding message.

## Getting Started

1.  **Prerequisites:** You need to have the Java Development Kit (JDK) installed on your system.
2.  **Download:** You can download the `TrafficLight.java` file from this repository.
3.  **Compilation:** Open a terminal or command prompt, navigate to the directory where you saved `TrafficLight.java`, and compile the code using the Java compiler:
    ```bash
    javac TrafficLight.java
    ```
4.  **Execution:** After successful compilation, run the program using the Java Virtual Machine:
    ```bash
    java TrafficLight
    ```

## Usage

The `main` method in the `TrafficLight` class provides a simple simulation. When you run the program, it will output the following to the console:

You can modify the `main` method to further simulate traffic light behavior, such as implementing a sequence of colors (red, yellow, green), adding a yellow light state, or introducing delays to mimic real-world timing.

## Potential Enhancements

* Add a "yellow" light state with its own duration and methods (`isYellow()`).
* Implement a state machine to manage the sequence of traffic light colors automatically.
* Introduce delays using `Thread.sleep()` to simulate the passage of time.
* Create a more complex simulation involving multiple traffic lights or traffic flow.
* Incorporate user input to control the traffic light.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua



