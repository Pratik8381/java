package conditionalstatement.ifelse;

import java.util.Scanner;

//Program to check if a number is divisible by both 2 and 3.
public class divisibleby2and3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any no");
        int no= scanner.nextInt();
        if (no%2==0 && no%3==0)
        {
            System.out.println("THe no is divisible by 2 and 3");
        }
        else {
            System.out.println("No is not divisible by 2 and 3");
        }
    }
}
