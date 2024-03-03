package loopnotion;

import java.util.Scanner;

//Calculate the sum of digits of a number given by user. E.g.-
//
//INUPT : 123 OUPUT : 6
public class assignment12 {
    public static void main ( String args[]){
        System.out .println();
        Scanner scanner = new Scanner(System.in);
        int no1 = scanner.nextInt();
        int sum=0;
        int digit ;
        int rev ;
        while (no1>0){
            digit= no1%10;
            System.out.println(digit);
            sum =sum+digit;
            no1= no1/10;




        }
        System.out.println(sum);





    }
}
