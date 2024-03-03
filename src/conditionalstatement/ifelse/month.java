package conditionalstatement.ifelse;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        System.out.println("print the Month");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month==1)
        {
            System.out.println("It is jan");
        }
        if (month==2)
        {
            System.out.println("It is feb");
        }
        if (month==3)
        {
            System.out.println("It is march");
        }
        if (month==4)
        {
            System.out.println("It is march");
        }
        if (month==5)
        {
            System.out.println("It is april");
        }
        if (month==6)
        {
            System.out.println("It is may");
        }
        if (month==7)
        {
            System.out.println("It is june");
        }
        if (month==8)
        {
            System.out.println("It is junly");
        }
        if (month==9)
        {
            System.out.println("It is augst");
        }
        if (month==10)
        {
            System.out.println("It is sep");
        }
        if (month==11)
        {
            System.out.println("It is oct");
        }
        if (month==12)
        {
            System.out.println("It is dec");
        }
        if (month<1 || month >12)
        {
            System.out.println("It is default");
        }
    }
}
