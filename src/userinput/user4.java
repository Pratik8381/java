package userinput;

import java.util.Scanner;

//- Assignment - 05
//
//    Take side of a square from user and print area and perimeter of it.
public class user4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the side");
        int side = scanner.nextInt();
        int area = side*side;
        int perimeter = 4*side;
        System.out.println("the area is"+area);
        System.out.println("the perimeter is"+perimeter);
    }
}
