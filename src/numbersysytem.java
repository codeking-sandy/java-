
import java.util.Scanner;


public class numbersysytem {
    public static void main (String[] args) {

        System.out.println("This i an odd even number");

        Scanner input=new Scanner (System.in);
        System.out.println("enter your first number");
        int num1= input.nextInt();
//        System.out.println("Enter your second number");
//        int num2= input.nextInt();

        if((num1 & 1)==1){
            System.out.println("the number is odd");
        }else{
            System.out.println("the number is even");
        }



    }
    }




