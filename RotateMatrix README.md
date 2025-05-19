# Rotate Matrix 90 Degrees Clockwise (Java)

This Java program rotates a square matrix by 90 degrees clockwise.

## Overview

The `RotateMatrix` class contains two methods:

-   `rotate90DegreesClockwise(int[][] matrix)`: Rotates a given square matrix by 90 degrees clockwise in-place.
-   `printMatrix(int[][] matrix)`: Prints the elements of a given matrix to the console.

The `main` method demonstrates the usage of these methods with a sample square matrix, printing the original and rotated matrices.

## Features

-   Handles null or empty matrices, returning without any output in such cases.
-   Rotates the matrix by transposing it and then reversing each row.
-   Provides a utility method to print matrices in a readable format.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `RotateMatrix.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac RotateMatrix.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java RotateMatrix
    ```
