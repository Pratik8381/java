package loopnotion;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
public class assignmentno20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no=scanner.nextInt();
        int multiplication ;
        for (int i=1; i<=10; i++){
            multiplication=no*i;
            System.out.println(multiplication);
        }

    }
}
