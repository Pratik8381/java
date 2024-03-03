package conditionalstatement.ifelse;

import java.util.Scanner;

//
//A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
//
//Ask user for their salary and year of service and print the net bonus amount.
public class salary {
    public static void main(String[] args) {
        System.out.println("The bonus amount");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = scanner.nextInt();
        System.out.println("Enter the years");
        int years = scanner.nextInt();
        if (years<=5)
        {
            System.out.println(salary*0.5);
        }
        else
        {
            System.out.println("doesent give anything");
        }

    }
}
