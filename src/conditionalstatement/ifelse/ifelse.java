package conditionalstatement.ifelse;

import java.util.Scanner;

public class ifelse {
   /* control statement is used for the control the flow of the execution of the program using some Keywords.
    it is the divided into the three parts
    1.conditional statement /desision Making
    the conditional statement is used of the run or the execute the code in to the program
   -if else
   -switch


    2.looping/repeat/iteration
   the loop is used for the run the some part of program again and again in to the program.
   -for loop
   -while loop
   -do while loop
    3.jump Statement/Traspher
    the jump statement id used for the jump the one statement to another statement

*/

    // odd or even
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No");
int no = scanner.nextInt();
if (no%2==0)
{
    System.out.println("It is the even no"+no);
}
else {
    System.out.println("it is odd no");


        }

    }

}
