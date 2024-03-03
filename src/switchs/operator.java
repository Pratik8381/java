package switchs;

import java.util.Scanner;

//Take two numbers from user and an operator (+, -, *, /) and then calculate the value. (Use switch statement)
public class operator {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter two no");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        char s = scanner.next().charAt(0);
        switch (s)
        {
            case '+' :
                System.out.println(n1+n2); break;
                 case '-' :
                System.out.println(n1+n2); break;
                 case '/' :
                System.out.println(n1+n2); break;
                 case '*' :
                System.out.println(n1+n2); break;
                 case '%' :
                System.out.println(n1+n2); break;

        }
    }
}
