public class arraySubtract {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 4, 1};
        int[] arr2 = {3, 9, 8, 0};

        int[] result = subtractArrays(arr1, arr2);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] subtractArrays(int[] a, int[] b) {
        int[] c = new int[Math.max(a.length, b.length)];
        String number1= a.toString();
        if(a.length >= b.length){
            int borrow = 0;
            for(int i=0; i<a.length; i++) {
                int sub = a[a.length-1-i]-borrow - (i>=b.length? 0 : b[b.length-1-i]);
                borrow = 0;
                if(sub < 0) {
                    sub += 10;
                    borrow = 1;
                }
                c[c.length-1-i] = sub;
            }
            return c;
        }
        else {
            int borrow = 0;
            for(int i=0; i<a.length; i++) {
                int sub = a[a.length-1-i]-borrow - (i>=b.length? 0 : b[b.length-1-i]);
                borrow = 0;
                if(sub < 0) {
                    sub += 10;
                    borrow = 1;
                    }
                    c[c.length-1-i] = sub;
            }
            if(borrow == 1){
                for (int i=0; i<c.length; i++){
                    c[i] *= -1;
                }
            }
            return c;
        }
    }
}
