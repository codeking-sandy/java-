import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to gcd tutorial");
        System.out.println("Enter the first number");
        int first =input.nextInt();
        System.out.println("Enter the second number ");
        int second =input.nextInt();
        int gcd =GCD(first ,second);
        System.out.println("The Gcd of the given number is  =" + gcd);

    }
    public static int GCD(int first, int second){
        int gcd =1;
        int i =2;
        int least=least(first,second);
        while(i<=least){
            if(first%i==0&&second%i==0){
                gcd=i;
            }
            i++;
        }



return gcd;
    }

    public static int least(int first , int second){
        if(first<second){
            return first;

        }else{
            return second;
        }
    }
}

