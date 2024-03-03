package loopnotion;

import java.util.Scanner;

//write a program to find the multiplication of 2 numbers without *using operator
public class assignmentno25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        int sum = 0;
        for (int i=1; i <= no2; i++ ){
            sum= sum+no1;

        }
        System.out.println(sum);

    }
}
