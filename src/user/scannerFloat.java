package user;

import java.util.Scanner;

public class scannerFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no in to the float");
        float input = scanner.nextFloat();
        System.out.println("The input into the float is"+input);
    }
}
