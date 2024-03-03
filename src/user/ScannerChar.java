package user;

import java.util.Scanner;

public class ScannerChar {

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the char of string");
//        String string = scanner.next();
//        char ch = string.charAt(0);
//        System.out.println("Enter first letter of string"+ch);
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string");
    String st = scanner.next();

    char ch = st.charAt(0);
    System.out.println( "the string is"+st);
    System.out.println(+ch);
}

    }
