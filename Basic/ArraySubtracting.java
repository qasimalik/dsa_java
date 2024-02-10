import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySubtracting {
  public static void main(String[] args) {
      int arr1[] = {1,2,3,4};
      int arr2[] = {9,8,7,6};
      int[] answer = subtract(arr1, arr2);
      System.out.println(Arrays.toString(answer));
    }
    
     private static int[] subtract(int[] n1, int[] n2) {
        List<Integer> sub = new ArrayList<>();
        int i = n1.length-1, j = n2.length-1, c = 0;
        while(i >= 0 || j >= 0) {
            int a = i < 0 ? 0 : n1[i--];
            int b = j < 0 ? 0 : n2[j--];
            int sum = a - b + c;
            if(sum < 0) {
                c = -1;
                sum += 10; 
            }
            else {
                c = 0;
            }
            sub.add(sum);
        }
        
        // Swap num1 and num2, then do it again.
        if(c < 0) {
            int[] tmp = subtract(n2, n1);
            tmp[0] *= -1;
            return tmp;
        }
        Collections.reverse(sub);
        
        // Remove leading zeros
        int start = 0;
        while(sub.get(start) == 0 && start < sub.size()-1) start++;
        int[] ans = new int[sub.size() - start];
        for(int k = 0; k + start < sub.size(); k++) {
            ans[k] = sub.get(start+k);
        }
        return ans;
    }
  }