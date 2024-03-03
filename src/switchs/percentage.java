package switchs;

import java.util.Scanner;

//Write a program to enter the marks of a student in 5 subjects. Calculate the total and average of marks using switch case.
public class percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of 5 sub");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int sum =0;
        int avg =0;
        switch (sum) {
            case 1:
                sum = n1 + n2 + n3 + n4 + n5;
                System.out.println(+sum);
                break;
        }
        switch (avg) {
            case 1:
                avg = sum / 5;
                System.out.println(+avg);
        }









    }
    }

