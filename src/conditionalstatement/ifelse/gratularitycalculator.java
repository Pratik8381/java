package conditionalstatement.ifelse;

import java.util.Scanner;

public class gratularitycalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gratularity Calculator");
        float MonthlySallay =scanner.nextFloat();
        float Years =scanner.nextFloat();
        if (Years>=5){
            System.out.println(MonthlySallay*Years*15/26);
        }
        else {
            System.out.println("No granularity");
        }

    }
}
