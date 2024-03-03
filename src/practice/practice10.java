package practice;

import java.util.Scanner;

//Program to check if a character is an alphabet or not.
public class practice10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch =scanner.next().charAt(0);
        if (ch>='a'&& ch<='z' || ch>='A'&& ch<='B')
        {
            System.out.println("it is Alphabet");
        }
        else {
            System.out.println("it is not Alphabet");
        }
    }
}
