package switchs;

import java.util.Scanner;

//Take three number input from user and print them in ascending order using switch statement.
public class asendingorder {
    public static void main(String[] args) {
        System.out.println("the assending order");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int t;
        switch (n1<n2? 1:0)
        {
            case 1 :
            t = n1;
            n1 = n2;
            n2 = t;


        }
        switch (n1<n3? 1:0)
        {
            case 1 :
                t = n1;
                n1 = n3;
                n3 = t;


        }
        switch (n2<n3? 1:0)
        {
            case 1 :
                t = n2;
                n2 = n3;
                n3 = t;


        }
        System.out.println(+n1+","+n2+","+n3);
    }
}
