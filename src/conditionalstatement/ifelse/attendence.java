package conditionalstatement.ifelse;

import java.util.Scanner;

//- Assignment - 08
//
//    A student will not be allowed to sit in exam if his/her attendance is less than 75%.
//
//    Take following input from user
//
//    Number of classes held
//
//    Number of classes attended.
//
//    And print
//
//    percentage of class attended
//
//    Is student is allowed to sit in exam or not.
public class attendence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Number of classes held");
        float ch = scanner.nextFloat();
        System.out.println(+ch);
        System.out.println(" Number of classes attended.");
         float ca = scanner.nextFloat();
        System.out.println(+ca);

        float per = ca/ch*100;
        System.out.println(per);
        if (per>=75)
        {
            System.out.println("Allow for the Exam");
        }
        else
        {
            System.out.println("Not allow for exam");
        }
//- Assignment - 09
//    
//    Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
    }
}
