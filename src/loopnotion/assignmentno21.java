package loopnotion;

import java.util.Scanner;

//write a program to find the sum of n numbers
public class assignmentno21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int sum=0;
        int n= scanner.nextInt();
        for (int i=1; i<=n; i++){
            sum=sum+i;


        }
        System.out.println(sum);
    }
}
