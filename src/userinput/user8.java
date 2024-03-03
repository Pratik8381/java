package userinput;

import java.util.Scanner;

//- Assignment - 09
//
//    Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
public class user8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two variable");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a<50);
        System.out.println(a<b);
    }
}
