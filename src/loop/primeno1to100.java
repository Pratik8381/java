package loop;

import java.util.Scanner;

public class primeno1to100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        for (int n =1; n<=10000; n++ )
        {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {

                sum = sum + i;
            }

        }

        if (sum == n) {
            System.out.println(+n);
        }
    }

    }
}
