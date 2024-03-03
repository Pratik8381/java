package switchs;
// we can use the byte short int char string enum
// We can be use the Switch statement when we can be have more than 3 or 4 values
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        System.out.println("Print the Month");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No");

        int Month = scanner.nextInt();
        switch (Month) {
            case 1 :
                System.out.println("jan"); break;
 case 2 :
                System.out.println("feb");break;
 case 3 :
                System.out.println("march");break;
 case 4 :
                System.out.println("April");break;
 case 5 :
                System.out.println("june");break;
 case 6 :
                System.out.println("july");break;
 case 7 :
                System.out.println("Aug");break;
 case 8 :
                System.out.println("sep");break;
 case 9 :
                System.out.println("oct");break;
 case 10 :
                System.out.println("nov");break;
 case 11 :
                System.out.println("dec");break;
 case 12 :
                System.out.println("jan");break;
default :
                System.out.println("jan");break;

        }
    }
}
