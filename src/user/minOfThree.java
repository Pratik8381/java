package user;

import java.util.Scanner;

public class minOfThree {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any three no");
        double no1 = scanner.nextDouble();
        double no2 = scanner.nextDouble();
        double no3 = scanner.nextDouble();
        System.out.println(
                no1 < no2 && no1<no3 ? no1 : no2<no1 && no2< no3 ? no2 : no3
        );
    }
}
