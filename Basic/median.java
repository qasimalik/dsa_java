public class median {
    public static void main(String[] args) {
        int arr1[] = {1, 3};
        int arr2[] = {2, 4};
        double median = findMedian(arr1, arr2);
        System.out.println(median);
    }

    static double findMedian(int arr1[], int arr2[]){
        double[] arr = mergeArray(arr1, arr2);
        int length = arr.length;

        double mid = (double) length /2;

        if (length%2==0) {  
            return (arr[(int)mid-1] + arr[(int)mid]) /2;
        } else {
            return arr[(int)mid];
        }
    }

    static double[] mergeArray(int nums1[], int nums2[]){
        int m = nums1.length;
        int n = nums2.length;
        double mergedArray[] = new double[m+n];
        
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while(i < m){
            mergedArray[k++] = nums1[i++];
        }

        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }

}
