package conditionalstatement.ifelse;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        //Take two int values from user and print greatest among them.
        System.out.println("The program of the calculating the greatest no ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two no");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        if( no1>no2)
        {
            System.out.println("The no one is greater than no two="+no1);
        }
        else {
            System.out.println("The no Two is greater than no one="+no2);
        }
    }
}
