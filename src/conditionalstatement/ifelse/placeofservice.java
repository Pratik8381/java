package conditionalstatement.ifelse;
//- Assignment - 12
//    1. Ask user to enter age, gender ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//    2. if employee is female, then she will work only in urban areas.
//    3. if employee is a male and age is in between 20 to 40 then he may work in anywhere
//    4. if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//    5. And any other input of age should print "ERROR".
import java.util.Scanner;

public class placeofservice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age of user");
        int age = scanner.nextInt();
        System.out.println("Enter the gender of user");
        char g = scanner.next().charAt(0);
        System.out.println("Enter the marital status of user");
        char m = scanner.next().charAt(0);
        if (g=='m'&& age>=20&& age<=40) {
            System.out.println("Male");
            System.out.println("work in anywhere");

        }
        else if (g=='m'&& age>=40&& age<=40)
        {
            System.out.println("Male");
            System.out.println("he will work in urban areas only");
        } else if (g=='f') {
            System.out.println("she will work only in urban areas");

        }
        else {
            System.out.println("Error");
        }


    }
}
