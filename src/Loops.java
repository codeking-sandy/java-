import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {
//Scanner input =new Scanner(System.in);
//Enter the first number
        greet();

      int first =readNumber();
//        System.out.println("enter the second number ");
        int second =readNumber() ;
        int sum=first+second;

        System.out.println("sum of the number is : "+sum);
    }
    public static int readNumber(){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the  number");
        int number= input.nextInt();
        return number;
    }

public static void greet(){
    System.out.println("welcome to the calculator");
}


}