import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//challenge
//        check if the number is positive or negative

       /* System.out.println("enter the number ");
        double num = input.nextDouble();
        if(num==0){
            System.out.println("the number is zero");
        }else if(num>0){
            System.out.println("the number is positive");
        }else{
            System.out.println("the number is negative");
        }*/
//        check if the number is odd or even
        /*System.out.println("enter the number you want to check");
        int numb= input.nextInt();
        if(numb%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }*/

//       create a program that determines greatest of three number
        /*System.out.println("enter the first number");
        int a= input.nextInt();
        System.out.println("Enter the second number");
        int b= input.nextInt();
        System.out.println("enter the third number ");
        int c= input.nextInt();
        if(a>b&&a>c){
            System.out.println( a +"is greater than" + b+ "&" + c);
        }else if(b>a && b>c){
            System.out.println(b+"is greater than " + a +"&" +c);
        }else{
            System.out.println(c+" is grater than "+a +"&" +b);
        }*/

//create a program that calculates grades based on marks

        System.out.println("enter your age");
        int age =input.nextInt();
        if(age>=60){
            System.out.println("you are a senior citizen");
        }else if(age>=20){
            System.out.println("you are adult");
        }else if(age>=13){
            System.out.println("you are teen");
        }else{
            System.out.println("you are child");
        }


    }



}
