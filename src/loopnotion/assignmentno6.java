package loopnotion;

import java.util.Scanner;

//factorial
public class assignmentno6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        int sum= 1;
        int fac=0;

        for (int i=1; i<=n; i++){
            sum= sum*i;




        }
        System.out.println(sum);
    }
}
