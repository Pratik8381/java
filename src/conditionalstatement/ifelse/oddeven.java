package conditionalstatement.ifelse;

import java.util.Scanner;

//Program to check if a number is even or odd.
public class oddeven {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int no = scanner.nextInt();
        if (no%2==0)
        {
            System.out.println("The no is even");
        }
        else
        {
            System.out.println("No is odd");
        }
    }
}
