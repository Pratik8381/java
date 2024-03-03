package practice;

import java.util.Scanner;
//- Assignment - 15
//
//    Write a program to calculate the sum of the digits of a 3-digit number.

public class practicle8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int no =scanner.nextInt();
        int first = (no/100)%10;
        System.out.println(+first);
        int second = (no/10)%10;
        System.out.println(+second);
        int third = no%10;
        System.out.println(+third);
int sum = first+second+third;
        System.out.println("The sum of the no= "+sum);
    }
}
