package conditionalstatement.ifelse;

import java.util.Scanner;

//1. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//2. Ask user for quantity
//3. Suppose, one unit will cost 100.
//4. Judge and print total cost for user.
public class shopkeeper {
    public static void main(String[] args) {
//1000=10%
        //2000=20%
        //3000=30%
        
        System.out.println("Discount");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity");


        int q = scanner.nextInt();

        float co = q*100;
        System.out.println("the cost is"+co);
        float totaldiscount;

        if (co>=1000){

            totaldiscount= co *0.1f;
            
            System.out.println(+totaldiscount);
        } else if (co>=2000 && co<=3000) {
            totaldiscount =co*0.2f;
            System.out.println(totaldiscount);

        }

        else if (co>=3000 && co<=3000) {
            totaldiscount =co*0.3f;
            System.out.println(totaldiscount);

        }
        else
        {
            System.out.println("The discount is not applicable");
        }




    }
}
