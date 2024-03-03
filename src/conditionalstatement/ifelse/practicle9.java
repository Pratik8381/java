package conditionalstatement.ifelse;

import java.util.Scanner;

public class practicle9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Program to check if a number is positive or negative.
        int no = scanner.nextInt();
        if (no>=1)
        {
            System.out.println("The no is positive");
        }
        else {
            System.out.println("No is negative");
        }
    }
}
