package conditionalstatement.ifelse;
////- Assignment - 09
////
////    Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
//
import java.util.Scanner;

public class attendence2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Number of classes held");
            float ch = scanner.nextFloat();
            System.out.println(+ch);
            System.out.println(" Number of classes attended.");
            float ca = scanner.nextFloat();
            System.out.println(+ca);
            System.out.println("Is there any medical issue");
            char m =scanner.next().charAt(0);

            float per = ca/ch*100;
            System.out.println(per);
            ///m===y allow for exam
            if (per>=75 || m=='y')
            {
                System.out.println("Allow for the Exam");
            }
            else
            {
                System.out.println("Not allow for exam");
            }
            }


     }


