package loopnotion;

import java.util.Scanner;

//Write a program to find prime factor of a number.
//
//If a factor of a number is prime number then it is its prime factor.
public class assignment15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int i=2;
       while ( no>=2){
           while (no%i==0){
               System.out.println(i);
               no =no/i;
           }
           i++;

       }
    }
}
