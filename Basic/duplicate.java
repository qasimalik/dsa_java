public class duplicate {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,3,2,1};
        solution(arr);
    }

    //check the duplicate occurance of the elements in the array
    public static void solution(int arr[]){
        int n = arr.length;
        int count = 0;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
