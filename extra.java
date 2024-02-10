import java.util.Scanner;

class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size;
        System.out.print("Enter the size of array: \n");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array: ");
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sm(arr, size);
    }


// {7, 8, 1, 2, 5, 3, 10}

    public static void sm(int[] arr, int size){
        int max = Integer.MIN_VALUE, ind = -1, sm = Integer.MIN_VALUE, sind = -1;
        for(int i=0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
                ind = i;
            } 
        }

        for(int i =0; i< size; i++){
            if (arr[i] > sm && arr[i] != max) {
                sm = arr[i];
                sind = i;
            }
        }
        System.out.println(max + " " + ind);
        System.out.println(sm + " " + sind);
    }
}