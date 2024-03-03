package practice;

import java.util.Scanner;

//- Assignment - 16
//
//    Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
public class practile8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = scanner.nextInt();
        int first = (no/100)%10;
        System.out.println(first);
        int second = (no/10)%10;
        System.out.println(second);
        int third = no%10;
        System.out.println(third);
        int reverse = third*100+second*10+first;
        System.out.println(reverse);



    }
}
