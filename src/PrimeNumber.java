import java.util.Scanner;


public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("check if the number is prime or not ");
        int num =input.nextInt();
        boolean prime=prime(num);
        if(prime){
            System.out.println("your number is prime");

        }else {
            System.out.println("your number is not prime");
        }

    }
    public static boolean prime(int num) {
        int i=2;
        while(i<num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }

     return true;

    }



}
