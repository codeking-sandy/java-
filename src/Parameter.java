import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the number you want to multiply ");
        int num =input.nextInt();

//Multiplicaton using loop
         for(int i =1;i<=10;i++ ){
             int mult =num*i;
             System.out.println(num+ " X "+i +"="+mult);

         }



    }
}