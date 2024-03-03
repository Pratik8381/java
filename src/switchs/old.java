package switchs;

import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among them using switch case.
public class old {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int t;
        switch (n1>n2 ? 1 :0)
        {
            case 1 :
                t=n1;
                n1=n2;
                n2 =t;
        }switch (n1>n3 ? 1 :0)
        {
            case 1 :
                t=n1;
                n1=n3;
                n3 =t;
        }switch (n2>n3 ? 1 :0)
        {
            case 1 :
                t=n2;
                n2=n3;
                n3 =t;
        }
        System.out.println(+n1+"Itis smallest guy");
        System.out.println(+n3+"Itis greatest guy");
    }
}
