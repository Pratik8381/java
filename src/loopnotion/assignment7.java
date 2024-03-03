package loopnotion;

import java.util.Scanner;

//- Assignment - 08
//
//    Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
public class assignment7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       int a= scanner.nextInt();
       int b= scanner.nextInt();
       int min=0;
       if (a>b){
           min=b;
       }
       else {
           min=a;
       }
       for (int i= min; i>0; i--){
           if (a%i==0 && b%i==0){
               System.out.println(i);
               break;
           }

       }

    }
}
