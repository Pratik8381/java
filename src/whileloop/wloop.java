package whileloop;

import java.util.Scanner;

public class wloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no =scanner.nextInt();
        int sum =0;
        while (no>0){
            int digit = no%10;
            System.out.println(digit);
            sum=sum+digit;
            no = no/10;
        }
        System.out.println(sum);
    }
}
