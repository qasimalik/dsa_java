public class pascalTriangle {
        public static void main(String[] args) {
            int numRows = 5; // You can change the number of rows as per your requirement

            // Generate and print Pascal's Triangle
            printPascalTriangle(numRows);
        }

        static void printPascalTriangle(int numRows) {
            for (int i = 0; i < numRows; i++) {
                // Print leading spaces to center the triangle
                for (int space = 0; space < numRows - i; space++) {
                    System.out.print(" ");
                }

                int coefficient = 1;
                for (int j = 0; j <= i; j++) {
                    // Print the current coefficient
                    System.out.print(coefficient + " ");

                    // Calculate the next coefficient
                    coefficient = coefficient * (i - j) / (j + 1);
                }

                System.out.println(); // Move to the next line for the next row
            }
        }
}
