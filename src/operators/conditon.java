package operators;

import java.util.Scanner;

//area of triangle
public class conditon {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length");
        int l = scanner.nextInt();
         System.out.println("Enter the breadth");
        int d = scanner.nextInt();
        int ta = (l*d)/2;
        System.out.println("Area of triangle" +ta);

    }
}
