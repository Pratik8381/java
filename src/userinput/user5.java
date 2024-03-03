package userinput;

import java.util.Scanner;

//- Assignment - 06
//
//    Write a program to find square of a number.
//
//
public class user5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ineger no");
        int sq = scanner.nextInt();
        int square = sq*sq;
        System.out.println("The area of the no is "+square);
    }
}
