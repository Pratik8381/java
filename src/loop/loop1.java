package loop;

import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the screen.
public class loop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The integers are");
        int sum =0;

        for (int i=1; i<=10; i++)
        {
          sum =sum+ scanner.nextInt()  ;
        }
        System.out.println(sum);

        int avg= sum /10;
        System.out.println(avg);
    }

}
