public class TOH {
    public static void main(String[] args) {
    int n = 3;
    char Source = 'A', Target = 'B', Auxiliary = 'C';
    towerOfHanoi(n, Source, Target, Auxiliary);
    }

    public static void towerOfHanoi(int n, char Source, char Target, char Auxiliary){
        if(n == 0){
            return;
        }

        towerOfHanoi(n-1, Source, Auxiliary, Target);
        System.out.println("Move Disc " + n + " from " + Source + " to " + Target);
        towerOfHanoi(n-1, Auxiliary, Target, Source );
    }
}
