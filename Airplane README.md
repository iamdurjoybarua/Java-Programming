# Simple Airplane Flight Information System in Java

This repository contains a basic Java program that simulates airplane flight information. It includes a single class, `Airplane`, to represent flight details and their current status.

## Overview

The system consists of one main class:

-   **`Airplane`**: This class represents an airplane flight with attributes for flight number, destination, scheduled departure time, delay status, and delay duration (if applicable). It provides functionalities to:
    -   Get flight information (flight number, destination, departure time).
    -   Check if a flight is delayed.
    -   Get the delay duration.
    -   Set the delay status and duration.
    -   Retrieve a formatted string describing the current flight status.

The `main` method within the `Airplane` class demonstrates the usage of these functionalities by creating `Airplane` objects, setting delays, and displaying their status.

## Getting Started

To run this program, you need to have Java Development Kit (JDK) installed on your system.

1.  **Save the code:** Save the provided Java code into a file named `Airplane.java`.
2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile the Java file using the following command:

    ```bash
    javac Airplane.java
    ```

    This will generate `Airplane.class` file.
3.  **Run the program:** Execute the `Airplane` class using the following command:

    ```bash
    java Airplane
    ```

    This will run the `main` method in the `Airplane` class and you will see the output in your console.

## Functionality

### Creating an Airplane Object

The `Airplane` class constructor initializes a new flight with its flight number, destination, and scheduled departure time. Initially, the flight is set as not delayed with a zero delay duration.

```java
public Airplane(String flightNumber, String destination, LocalTime departureTime) {
    this.flightNumber = flightNumber;
    this.destination = destination;
    this.departureTime = departureTime;
    this.isDelayed = false; // Initially, the flight is not delayed
    this.delayDuration = LocalTime.of(0, 0); // Initial delay is zero
}
```

**Usage:**

```java
LocalTime departure = LocalTime.of(10, 30);
Airplane flight = new Airplane("UA301", "New York", departure);
```

### Getting Flight Information

Methods like `getFlightNumber()`, `getDestination()`, and `getDepartureTime()` allow you to retrieve the basic details of the flight.

**Usage:**

```java
System.out.println("Flight Number: " + flight.getFlightNumber());
System.out.println("Destination: " + flight.getDestination());
System.out.println("Departure Time: " + flight.getDepartureTime().format(DateTimeFormatter.ofPattern("HH:mm")));
```

### Checking and Getting Delay Information

The `isDelayed()` method returns a boolean indicating whether the flight is currently delayed. The `getDelayDuration()` method returns a `LocalTime` object representing the duration of the delay.

**Usage:**

```java
if (flight.isDelayed()) {
    System.out.println("Flight is delayed by: " + flight.getDelayDuration().format(DateTimeFormatter.ofPattern("HH:mm")));
} else {
    System.out.println("Flight is on time.");
}
```

### Setting Delay Status

The `setDelayed(boolean delayed, LocalTime delay)` method allows you to set whether a flight is delayed and, if so, the duration of the delay.

**Usage:**

```java
LocalTime newDelay = LocalTime.of(0, 45); // Delay of 45 minutes
flight.setDelayed(true, newDelay);
System.out.println(flight.getFlightStatus());

flight.setDelayed(false, LocalTime.of(0, 0)); // Set back to on time
System.out.println(flight.getFlightStatus());
```

### Getting Flight Status

The `getFlightStatus()` method provides a user-friendly string summarizing the current status of the flight, including the flight number, destination, scheduled departure time, and whether it is delayed (and by how long).

**Usage:**

```java
System.out.println(flight.getFlightStatus());
```

## Example Usage

The `main` method in the `Airplane` class demonstrates the creation of `Airplane` objects, setting and checking their delay status, and displaying their overall status.

```java
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
```

## Potential Enhancements

  - **Arrival Time:** Add an estimated arrival time based on flight duration and potential delays.
  - **Gate Information:** Include the departure gate information.
  - **Flight Duration:** Store and display the expected flight duration.
  - **Status Updates:** Implement more detailed status updates (e.g., "Boarding", "In Flight", "Landed").
  - **Multiple Flights:** Create a system to manage multiple flights (similar to the `Bank` class in the previous example).
  - **Data Persistence:** Implement saving and loading flight data.
  - **User Interface:** Develop a simple command-line interface to query flight information.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
