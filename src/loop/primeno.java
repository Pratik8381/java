package loop;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
//        int no =scanner.nextInt();
//        boolean isaprime = true;
//        for (int i=2; i<=no/2;i++)
//        {
//            if(no%i==0){
//                isaprime= false;
//                break;
//            }
//        }
//        System.out.println(isaprime? "it is prime": "it is not prime");
////        int count =0;
//        for (int i=0; i>=no/2 ; i++) {
//            System.out.println(no % i == 0);
//            count++;
//        }
//    if(count<=2)
//    {
//        System.out.println("it is a prime no");
//
//    }
//    else {
//
//        System.out.println("it is not prime");

//    }
        int no =scanner.nextInt();
        boolean isaprime = true;
        for (int i=2; i<=no/2; i++)
        {
            if (no%i==0){
                isaprime=false;
                break;
            }
        }
        System.out.println(isaprime ? "ITis a prime" : "it is a not a prime");


    }

}
