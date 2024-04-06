public class PascalTriangle {

    public static void main(String[] args) {
        int rows = 6; // Change the number of rows as needed
        printPascalTriangle(rows);
    }

    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // Print spaces for alignment
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print numbers for each row
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
