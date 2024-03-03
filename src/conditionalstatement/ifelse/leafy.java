package conditionalstatement.ifelse;
//- Assignment - 11
//
//    Write a program to check if a year is leap year or not.
//
//    If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
import java.util.Scanner;

public class leafy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        if (year%400==0){
            System.out.println("These is not leap year"+year);
        }
        else if (year%4==0 && year%100!=0) {
            System.out.println("These is not leap year"+year);


        }
        else {
            System.out.println("These is not a leap year"+year);
       }

    }
}
