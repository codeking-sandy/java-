import java.util.Scanner;
//what is n array
public class Array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        int[] myArr=new int[5];
//        myArr[0]=98;
//        myArr[1]=46;
//        myArr[2]=67;
//        myArr[3]=87;
//        myArr[4]=89;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[3]);
        int[] myArr={98,97,56,45,78};
//        int index=2;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[4]);
//        array travesrsal
        int index =0;
        while(index< myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
String[] myString=new String[4];
        myString[0]="My string";

        String[] newStrArr= {"first", "second", "third" ,"Fourth",};
        System.out.println(newStrArr.length);

    }
}
