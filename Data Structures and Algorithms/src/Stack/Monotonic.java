package Stack;

import java.util.*;

public class Monotonic {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        System.out.print("Original Increase: ");
        for (int num:
                nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] result1 = MonotonicIncrease(nums);
        System.out.print("Monotonic Increase: ");
        for (int num:
             result1) {
            System.out.print(num + " ");
        }

        System.out.println();
        int[] result2 = MonotonicDecrease(nums);
        System.out.print("Monotonic Decrease: ");
        for (int num:
                result2) {
            System.out.print(num + " ");
        }
    }

    public static int[] MonotonicIncrease(int[] arr){
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (stk.size() > 0 && stk.peek() > arr[i]){
                stk.pop();
            }
            stk.push(arr[i]);
        }
        int size = stk.size();
        int[] result = new int[size];
        Arrays.fill(result, 0);

        int j = size - 1;
        while (!stk.isEmpty()) {
            result[j] = stk.peek();
            stk.pop();
            j--;
        }
        return result;
    }

    public static int[] MonotonicDecrease(int[] arr){
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (stk.size() > 0 && stk.peek() < arr[i]){
                stk.pop();
            }
            stk.push(arr[i]);
        }
        int size = stk.size();
        int[] result = new int[size];
        Arrays.fill(result, 0);

        int j = size - 1;
        while (!stk.isEmpty()) {
            result[j] = stk.peek();
            stk.pop();
            j--;
        }
        return result;
    }
}
