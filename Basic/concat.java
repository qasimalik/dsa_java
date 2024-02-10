import java.util.Arrays;

public class concat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int[] ans =  new int[2*n];
        for(int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }

}
