public class RotateMatrix {

    public static void main(String[] args) {
        // Sample square matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix by 90 degrees clockwise
        rotate90DegreesClockwise(matrix);

        System.out.println("\nRotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }

    // Method to rotate a square matrix by 90 degrees clockwise
    public static void rotate90DegreesClockwise(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return; // Return if the matrix is null or empty
        }

        int n = matrix.length; // Size of the square matrix

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null or empty.");
            return;
        }

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}