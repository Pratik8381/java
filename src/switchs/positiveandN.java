package switchs;

import java.util.Scanner;

public class positiveandN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = scanner.nextInt();


        switch ((no>0)?1:(no<0)?2:3)
        {
            case 1 :
                System.out.println("it is a positive no");
                break;
            case 2 :
                System.out.println("it is a negative no");
                break;
            case 3 :
                System.out.println("zero");
                break;

            default:
                System.out.println("0");
                break;
        }
    }
}
