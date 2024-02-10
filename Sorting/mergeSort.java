package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7, 9};
        System.out.println("Unsorted Array = " + Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.print("Sorted Array = " + Arrays.toString(arr));
    }

    static void sort(int[] arr, int left, int right)
    {
        if(arr.length == 1 ){
            System.out.println(arr);
        }

        if (left < right){
            int middle = left + (right - left)/2;
            sort(arr, left, middle);
            sort(arr, middle+1, right);
            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int middle, int right){
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0; i<n1; i++){
            leftArray[i] = arr[left+i];
        }

        for(int j=0; j<n2; j++){
            rightArray[j] = arr[middle+1+j];
        }

        int i=0, j=0, k=left;

        while(i<n1 && j<n2){
            if (leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

