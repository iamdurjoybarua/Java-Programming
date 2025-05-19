public class BoundaryElements {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Boundary Elements:");
        printBoundaryElements(matrix);
    }

    // Method to print only the boundary elements of a 2D array
    public static void printBoundaryElements(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null or empty.");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // If the matrix has only one row or one column, print all elements
        if (rows == 1 || cols == 1) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
            }
            System.out.println(); // Add a newline after printing
            return;
        }

        // Print the top row
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        // Print the right column (excluding the top and bottom elements)
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // Print the bottom row (in reverse order, excluding the rightmost element)
        for (int j = cols - 1; j >= 0; j--) {
            if (rows > 1){ //To prevent out of bounds if rows is 1
                System.out.print(matrix[rows - 1][j] + " ");
            }
        }

        // Print the left column (in reverse order, excluding the top and bottom elements)
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }

        System.out.println(); // Add a newline after printing
    }
}