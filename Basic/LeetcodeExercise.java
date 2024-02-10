public class LeetcodeExercise {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2, 1 };
        if(isPalindrome(arr)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        int x = 12321;
        
        if(palindromeCheck(x)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static boolean isPalindrome(int arr[]) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            if (arr[start]!=arr[end]) {
                return false;
            }
            start++;
            end--;
        }
       return true;
    }

    static boolean palindromeCheck(int x){
        int ogNum = x;
        int rev = 0;
        while(x>0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return ogNum == rev;
    }
}
