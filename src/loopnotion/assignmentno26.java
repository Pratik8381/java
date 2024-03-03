package loopnotion;

import java.util.Scanner;

//write a program to find the division of 2 numbers without using /,% operators and print quotient and the remainder
public class assignmentno26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int no= scanner.nextInt();
        int divisor= scanner.nextInt();
        int c= no+divisor;
        int result = 0;
        while (c>divisor){
            c=c-divisor;
            result++;
        }
        System.out.println(result);
    }
}
