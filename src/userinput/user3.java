package userinput;

import java.util.Scanner;

//- Assignment - 04
//
//    Take name, roll number and field of interest from user and print in the format below :
//
//    Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
public class user3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name = scanner.nextLine();
        System.out.println("Enter the Roll No");
        short rollno = scanner.nextShort();
        System.out.println("Enter the field of interest");
        String foi = scanner.next();
        System.out.println("Hey, " +" my is "+Name+" and my roll no is "+rollno+". My field of interest are" +foi );



    }
}
