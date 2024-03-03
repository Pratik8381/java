package dowhileloop;

import java.util.Scanner;

//write a program to the get iip in char from user and when user print x the stop
public class koop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enyer the char");
char ch;
        do {
           ch = scanner.next().charAt(0);
            System.out.println("You entered"+ch);
        }
        while (ch!='x');
        {

        }
    }
}
