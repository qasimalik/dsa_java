public class pattern {
    public static void main(String[] args) {
        
        // Right angled triangle
        // for(int i= 0; i<5; i++){
        //     for(int j= 0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print(" ");
        //     System.out.println();
        // }

        // Inverted Right Angled triangle
        // for(int i= 0; i<5; i++){
        //     for (int j = 5; j > i; j--) {
        //         System.out.print("*");
        //     }
        //    System.out.print(" ");
        //    System.out.println();
        // }

        // Pyramid design
        // for (int i = 0; i < 4; i++) {
        //     for(int j = 4-i; j>=1; j--){
        //         System.out.print(" ");
        //     }
        //     for (int k = 0; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    
        // Inverted Pyramid design
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 4-i; k>=1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
}
