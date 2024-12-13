import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the fibonacci series");
        System.out.print("Enter your number");
        int num= input.nextByte();



        System.out.print("The fibonacci series are =");
        fibo(num);

    }
    public static void fibo(int num) {
        if (num<0)return;
            System.out.println("0");
        if (num==0)
      return;
        System.out.println("1");


       int first=0,second=1;
       while(first+second<=num){
int third=first+second;
           System.out.println(third+" ");
           first=second;
           second=third;


       }



    }
}
