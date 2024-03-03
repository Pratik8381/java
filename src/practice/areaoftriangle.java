package practice;

import java.util.Scanner;

//area of triangle
//A = 1/2 × b × h.
public class areaoftriangle {
    public static void main(String[] args) {
        System.out.println("Program to calculate area of triangle");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of b and h");
        double b = scanner.nextFloat();
        double h = scanner.nextFloat();
        double a = (b * h)/2;
        System.out.println("Area of Triangle"+a);
    }

}
