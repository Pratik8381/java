package userinput;

import java.util.Scanner;

//- Assignment - 08
//
//    Take 3 inputs from user and check :
//
//    all are equal
//
//    any of two are equal
//
//  use&& ||
public class user7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 no");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();


        boolean allequal = (n1==n2) && (n2==n3);
        boolean Twoequal = (n1==n2) || (n2==n3) || (n3==n1);

        System.out.println(allequal);
        System.out.println(Twoequal);
    }

}
