public class missingNum {
    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 13, 14};
        findMissingNum(arr);
    }
    
    public static void findMissingNum(int arr[]){
        int missingNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] + 1 != arr[i+1]){
                missingNum = arr[i] + 1;
            }
        }
        System.out.println("The missing Number is: " + missingNum);
    }
}
