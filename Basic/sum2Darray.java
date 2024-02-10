public class sum2Darray {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6}};
        int Sum = sum(a);
        System.out.print("The sum is "+ Sum);
    }
    public static int sum(int a[][]){
        int sum = 0;
        for(int i = 0; i< a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                {
                    sum = sum + a[i][j];

                }
            }
        }
        return sum;
    }
}
