package user;

import java.util.Scanner;

public class scannerInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any no");
        int userInt = scanner.nextInt();
        System.out.println("The input is"+userInt);
    }
}
