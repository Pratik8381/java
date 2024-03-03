package looping;

import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the screen.
public class loop1 {
    public static void main(String[] args) {
        System.out.println("Enter the 10 no");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i= 1 ; i<=10; i++)
        {
            sum = sum + scanner.nextInt();
        }
        System.out.println("The sum is" +sum);
        int avg = sum/10;
        System.out.println("average is"+avg);
    }
}
