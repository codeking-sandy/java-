import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse =");
        int num=input.nextInt();
        boolean isPaldinrome=isPalindrome(num);
        if(isPaldinrome){
            System.out.println("your number is a palindrome number");
        }else {
            System.out.println("your number is not palindrome");
        }



    }
    public static boolean isPalindrome(int num){
        return num==reversing(num);

    }
    public static int reversing(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;

        }
        return rev;
    }
}
