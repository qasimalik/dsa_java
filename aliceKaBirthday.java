/*
 * Given a matrix of size N*N, print the elements in a zig-zag fashion.
 */

 /*
  * Input: 1 2 3
           4 5 6
           7 8 9

    Output: 1 4 7 5 3 6 9
  */

public class aliceKaBirthday {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        zTranspose(matrix, n);

    }

    public static void zTranspose(int[][] matrix, int n){
        
        for (int i = 0; i < matrix.length - 1; i++) {
            System.out.print(matrix[i][0] + " ");
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        for (int i = 1; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix[0].length - 1] + " ");
        }
    }
}
