import java.util.Scanner;


public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Lcm chapter");
        System.out.print("Enter the number = ");
        int first = input.nextInt();
        System.out.println("enter the second number = ");
        int second = input.nextInt();
        int Lcm = lcm(first, second);
        System.out.println("Lcm of the numbers are " + Lcm);


    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
//            int factor = first * i;
            if (first*i%second==0) {
                return first*i;
            }
            i++;
        }



    }
}

