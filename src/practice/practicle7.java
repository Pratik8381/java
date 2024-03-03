package practice;

import java.util.Scanner;

public class practicle7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 4 digit no");
        int n = scanner.nextInt();
        int first = (n/1000)%10;
        System.out.println(+first);
        int second =(n/100)%10;
        System.out.println(+second);
        int third = (n/10)%10;
        System.out.println(+third);
        int fourth = n%10;
        System.out.println(+fourth);
        first =(first+2)%10;
        System.out.println(+first);
        second =(second+2)%10;
        System.out.println(+second);
        third = (third+2)%10;
        System.out.println(+third);
        fourth =(fourth+2)%10;
        System.out.println(+fourth);
    }
}
