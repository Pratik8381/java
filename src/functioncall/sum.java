package functioncall;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
      int ans=  sum2();
        System.out.println(ans);

    }
    static int sum2(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the no1");
        int no1=scanner.nextInt();
        System.out.println("Enter the no2");
        int no2=scanner.nextInt();
        int sum= no1+no2;
        return sum;

    }
    static void sum() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the no1");
        int no1=scanner.nextInt();
       System.out.println("Enter the no2");
        int no2=scanner.nextInt();
        int sum= no1+no2;
        System.out.println(sum);
    }
}
