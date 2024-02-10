public class arrayExercise {
    public static void main(String[] args) {
        int arr[] = { 12, 23, 42, 1, 25, 11, 9, 5, 100 };
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Original Array: ");
        printArray(arr);
        // System.out.println("Array after reversing without recurssion: ");
        // reverseArray1(arr, start, end);
        System.out.println("Array after reversing with recurssion: ");
        reverseArray2(arr, start, end);
        printArray(arr);
    }

    // Iterative method
    // static void reverseArray1(int arr[], int start, int end){
    //     while(start < end){
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     printArray(arr);
    // }

    // Recursive method
   static void reverseArray2(int arr[], int start, int end) {
       if (start < end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           reverseArray2(arr, start + 1, end - 1);
       }
   }

    // Print Array
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
