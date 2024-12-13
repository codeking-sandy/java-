import java.util.Scanner;


public class Sumodd {
    public static void main(String[] args){
      Scanner input =new Scanner(System.in);
        System.out.println("welcome to the factorial ");
        System.out.println("plz enter  your number");
        int num = input.nextInt();
        long fact=factorial(num);
        System.out.println("factorial is =" +fact);



}
public static long factorial (int num){

            if(num<2){
                return 1;
            }
            long fact =1;
            for(int i=2;i<=num; i++){
                fact*=i;
//                System.out.println("the factorial of the number is "+fact);
            }
            return fact;

}

}
