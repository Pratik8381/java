package practice;

import java.util.Scanner;

//prime no
public class pactiice {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int sum= 0;
        int perfect=0;
        int count =0;
        for (int i=1; i<=a/2; i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
                sum = sum+i;
count++;
            }

        }

        System.out.println(sum);
        System.out.println(sum==a ? " Nois perfectno": "Not a perfect no");
        if (count==1)
        {
            System.out.println("it is prime no");
        }
    }
}
