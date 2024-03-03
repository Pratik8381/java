package practice;

import java.util.Scanner;

public class ispowerof2 {
    static boolean powerof2 (int n) {
        if(n==0){
            return false;
        }
        return (n & (n-1))==0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(powerof2(n));
    }
}
