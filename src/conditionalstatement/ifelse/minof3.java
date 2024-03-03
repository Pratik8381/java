package conditionalstatement.ifelse;

import java.util.Scanner;

public class minof3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the three no");
        int No1 = scanner.nextInt();
        int No2 = scanner.nextInt();
        int No3 = scanner.nextInt();
        if (No1<No2 && No1<No3)
        {
            System.out.println("The No one is min no"+No1);
        } else if (No2<No1 && No2<No3) {

            System.out.println("The No Two is min no"+No2);

        }
        else {
            System.out.println("The No Three is min no"+No3);
        }
    }
}