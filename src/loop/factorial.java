package loop;

import java.util.Scanner;

//factorial of no
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int no = scanner.nextInt();
//        int f = 1;
//        for (int i=1 ; i<=no ; i++)
//        {
//            f= f*i;
//        }
//        System.out.println(f);
        int no =scanner.nextInt();
        int f=1;
        for (int i =1; i<=no; i++)
        {
            f= f*i;
        }
        System.out.println(f);
    }
}
