package loopnotion;

import java.util.Scanner;

//write a program to find whether the given number is a perfect number or not
public class assignmentno24 {
    public static void main(String[] args) {

        for ( int j= 1; j<=10000; j++) {
            int sum = 0;

            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum = sum + i;

                }

            }
            if (sum == j) {
                System.out.println(j);
            }
        }

    }
}
