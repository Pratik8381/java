package loopnotion;

import java.util.Scanner;

//write a program to find the sum of first n even numbers
public class assignmentno22 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1; i<=n;i++){
            if (i%2==0){
                sum=sum+i;

            }

        } System.out.println(sum);
    }
}
