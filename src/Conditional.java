import java.util.Scanner;


public class Conditional {
    public static void main (String[] args) {
//        conditional statement
//        age<5 75% discount
//        age>60
//        female=50%

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to driving license portal");
        System.out.print("Please enter your age");
        int age =input.nextInt();
        if(age>=18){
            System.out.println("you are eligible for driving ");
        }else{
            System.out.println("no go to ur home and drink milk");
        }





    }




}
