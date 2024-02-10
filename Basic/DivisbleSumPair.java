public class DivisbleSumPair{
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 1, 2, 3, 2, 6, 1};
        int k = 3;
        int answer = pair(arr, k);
        System.out.println("Answer is " + answer);
    }

    public static int pair(int[] arr, int k){
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if((arr[i] + arr[j]) % k == 0){
                    count = count+1;
                }
            }
        }
        return count;
    }
}