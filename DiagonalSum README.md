# Diagonal Sum of a Square Matrix (Java)

This Java program calculates the sum of the main diagonal and the secondary diagonal of a square matrix.

## Overview

The `DiagonalSum` class contains two methods:

-   `calculateMainDiagonalSum(int[][] matrix)`: Calculates and returns the sum of the main diagonal elements of a given square matrix.
-   `calculateSecondaryDiagonalSum(int[][] matrix)`: Calculates and returns the sum of the secondary diagonal elements of a given square matrix.

The `main` method demonstrates the usage of these methods with a sample square matrix and prints the results to the console.

## Features

-   Handles null or empty matrices, returning 0 in such cases.
-   Checks if the matrix is square, printing an error message and returning 0 if it's not.
-   Calculates the sum of the main diagonal elements (elements where row index equals column index).
-   Calculates the sum of the secondary diagonal elements (elements where row index plus column index equals matrix size minus one).
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `DiagonalSum.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac DiagonalSum.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java DiagonalSum
    ```
