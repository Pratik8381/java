package userinput;

import java.util.Scanner;

//- Assignment - 10
//
//    If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), write a program to calculate his total marks and percentage marks.
public class user9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 subject marks");
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float tm =300;
         float total = n1+n2+n3;
        System.out.println(+total);
        double per = (total/tm)*100;
       // per=per*100;
        System.out.println(per);

    }
}
