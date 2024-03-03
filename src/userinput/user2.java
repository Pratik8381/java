package userinput;

import java.util.Scanner;

//- Assignment - 03
//
//    Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
public class user2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the  l and b");
        double no1 = scanner.nextDouble();
        double no2 = scanner.nextDouble();
        double area = no1* no2;
        int op = (int) area;
        System.out.println( area);
    }

}
