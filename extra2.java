public class extra2 {
    public static void main(String[] args) {
     int a[] = {23, 45, 34, 67, 10};
     int b[] = {12, 10, 77, 90, 91};
     int c[] = {11, 9, 10, 13, 15};
     
     imposter(a,b, c);
    }

    public static void imposter(int[] a, int[] b, int[] c){
        int imax, jmax;
        for(int i = 0; i < a.length; i++){
            imax = b[i];
            for(int j = 0; j< b.length; j++){
                jmax = b[j];
                for(int k = 0; k< c.length; k++){
                    if(imax == jmax && jmax == c[k]){
                        System.out.println("Imposter is " + c[k]);
                    }
                }
            }
        }
        System.out.println("Imposter not found");
    }
}