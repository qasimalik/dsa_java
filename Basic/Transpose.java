public class Transpose {
    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        transposeMatrix(a);
    }


        public static void transposeMatrix(int a[][]){
            for (int i = 0; i< a.length; i++){
                for (int j = i+1; j<a[0].length; j++ ){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
            for (int i=0; i<a.length; i++){
                for (int j = 0; j< a.length; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
    }
}
