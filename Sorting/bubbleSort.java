package Sorting;
public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original Array: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSorting(arr);
    }

    static void bubbleSorting(int[] arr){
        int n = arr.length;
        System.out.println("Array length = " + n);
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
