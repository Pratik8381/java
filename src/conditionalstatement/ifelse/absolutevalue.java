package conditionalstatement.ifelse;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the no");
        int x = scanner.nextInt();
        if(x<0)
        {
            System.out.println("the absolute value is"+-x);
        }
        else if(x>0)
        {
            System.out.println("the absolute value is"+x);
        }
    }
}
