package practice;

import java.util.Scanner;

public class perfectsquareroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no = scanner.nextInt();
        double sqrt = Math.sqrt(no);
        String result = (sqrt-Math.floor(sqrt)==0)? "Is a perfect" : "is Not perfect";

        System.out.println(result);
    }
}
