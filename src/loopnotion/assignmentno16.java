package loopnotion;

import java.util.Scanner;

//Write a program in java to find the sum of the even and odd digits of the number which is given as input.
public class assignmentno16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int evensum=0;
        int oddsum =0;
        int digit;

        while (no>0){
            digit= no%10;
            if (digit%2==0){
                evensum= evensum+digit;

            }
            else{
                oddsum= oddsum+digit;

            }
           no=no/10;


        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}

