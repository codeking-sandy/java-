import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse =");
        int num=input.nextInt();
        int reverse=reversing(num);
        System.out.println("the reversed number is =" +reverse);

    }
    public static int reversing(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;

        }
   return rev;


    }
}
