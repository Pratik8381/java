package userinput;

import java.util.Scanner;

//- Assignment - 07
//
//    Take two different string input and print them in same line.
public class user6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string 1");
        String s1 = scanner.next();
        System.out.println("Enter the string ");
        String s2 = scanner.next();
        System.out.println(s1+s2);

    }
}
