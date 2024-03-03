package userinput;
//Write a program to take two integer inputs from user and print sum and product of them.

import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 2 integer");
        int n1 = scanner.nextInt();
         int n2 = scanner.nextInt();
        System.out.println(n1+n2);
        System.out.println("The product is" +n1*n2);



    }
}
