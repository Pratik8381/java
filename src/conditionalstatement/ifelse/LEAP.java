package conditionalstatement.ifelse;

import java.util.Scanner;

public class LEAP {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        if (year%400==0)
        {
            System.out.println("it is leap year");
        }
        else if (year%4==0 && year%100!=0) {

            System.out.println("it is leap year");
        }
        else {
            System.out.println("it is not leap year");
        }


    }
}
