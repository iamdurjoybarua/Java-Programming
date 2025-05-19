public class DiagonalSum {

    public static void main(String[] args) {
        // Sample square matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate and print the sum of the main diagonal
        int mainDiagonalSum = calculateMainDiagonalSum(matrix);
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);

        // Calculate and print the sum of the secondary diagonal
        int secondaryDiagonalSum = calculateSecondaryDiagonalSum(matrix);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }

    // Method to calculate the sum of the main diagonal of a square matrix
    public static int calculateMainDiagonalSum(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return 0; // Return 0 if the matrix is null or empty
        }

        // Check if the matrix is square
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            System.out.println("Matrix is not square. Cannot calculate main diagonal sum.");
            return 0; // Return 0 if the matrix is not square
        }

        // Initialize the sum to 0
        int sum = 0;

        // Iterate through the matrix and add the elements of the main diagonal
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i]; // Elements of the main diagonal have the same row and column indices
        }

        // Return the calculated sum
        return sum;
    }

    // Method to calculate the sum of the secondary diagonal of a square matrix
    public static int calculateSecondaryDiagonalSum(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return 0; // Return 0 if the matrix is null or empty
        }

        // Check if the matrix is square
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            System.out.println("Matrix is not square. Cannot calculate secondary diagonal sum.");
            return 0; // Return 0 if the matrix is not square
        }

        // Initialize the sum to 0
        int sum = 0;

        // Iterate through the matrix and add the elements of the secondary diagonal
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][rows - 1 - i]; // Elements of the secondary diagonal have indices i and (rows - 1 - i)
        }

        // Return the calculated sum
        return sum;
    }
}