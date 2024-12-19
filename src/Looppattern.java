import java.util.Scanner;

public class Looppattern {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Plz enter the no. of rows =");
            int rows= input.nextInt();
            printReverseRightHalfPyramid(rows);
            printRightHalfPyramid(rows);
            printLeftHalfPyramid(rows);


        }
        public static void printReverseRightHalfPyramid(int maxrows){
            System.out.println("this is righthalf reverse");
            int rows=maxrows;
            while(rows>0){
                int i=0;
                while(i<rows){
                    System.out.print(" *");
                   i++;
                }
                System.out.println();
                rows--;
            }
        }


        public static void printRightHalfPyramid( int maxrows){
            System.out.println("here is right half pyramid");
            int rows=0;
            while(rows < maxrows){
                System.out.print("*");
                int i=0;
                while(i<rows){
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows++;
            }
        }
    public static void printLeftHalfPyramid( int maxrows){
        System.out.println("here is left half pyramid");
        int rows=maxrows;
        while(rows >0){
//            this print space
            int j=0;
            while (j < rows-1) {
                System.out.println(" ");
                j++;

            }
//            this is for stars

            int i=0;
            while(i<=(maxrows-rows)){
                System.out.print("  *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}



