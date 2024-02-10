public class d2b {
    public static void main(String[] args) {
      d2b(1);  
    }

    public static void d2b(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        d2b(n / 2);
        System.out.print(n % 2);
    }
}
