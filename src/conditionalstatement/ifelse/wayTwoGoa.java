package conditionalstatement.ifelse;

import java.util.Scanner;

public class wayTwoGoa {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your budght");
        int budght = scanner.nextInt();
        long ip = scanner.nextLong();
        if (ip < budght)
        {
            System.out.println("go to the goa");

        }
        else
        {
            System.out.println("Stay Home Stay Safe");
        }
    }
}
