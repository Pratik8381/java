package conditionalstatement.ifelse;

import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class ifelsesquare {
    public static void main(String[] args) {
        System.out.println("Program of length and breadth ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        if (length == breadth)
        {
            System.out.println("It is a sauare");
        }
        else {
            System.out.println("These is not a square");
        }
    }
}
