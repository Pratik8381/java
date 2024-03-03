package user;

import java.util.Scanner;

public class maxOfTwo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 2 No");
        double no1 = scanner.nextDouble();
        double no2 = scanner.nextDouble();
        System.out.println(
                no1>no2 ? no1 : no2
        );


    }
}
