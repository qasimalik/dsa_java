import java.util.Scanner;

class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan amount: ");
        int amount = sc.nextInt();
        int month = 0;
        while(month < 3){
            int payment = amount * 10/100;
            amount = amount - payment;
            month++;
            System.out.println("Repayment Amount after " + month + " month = " + amount);
        }
    }
}