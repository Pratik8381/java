package loop;

import java.util.Scanner;

//for loop = (initialization; condition ;increment/decriment);
public class forloop {
    public static void main(String[] args) {
////        for (; ; )
//        for (;true;)
//        {
//            System.out.println("*" +
//                    "");
//        }
//    }
        //infanite
        //0dd no
//for (int i =0 ; i<=100 ; i=i+2)
//{
//    System.out.println("the even no are");
//    System.out.println(i);
//}
//        for (int i =1 ; i<=100 ; i=i+2)
//        {
//            System.out.println("the odd no are");
//            System.out.println(i);
//        }
//
//        int no =25;
//        for (int j =1 ; j<=10 ; j++ ) {
//
//            System.out.println(no*j);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int noo = scanner.nextInt();
//        for (int k =1 ;k<=10 ; k++)
//        {
//            System.out.println(k*noo);
//        }
        Scanner scanner = new Scanner(System.in);
        int noo = scanner.nextInt();
        int sum =0;
        int per =0;
        for(int i=1 ; i<=noo/2 ; i++)
        {
            if (noo%i==0)
            {

                System.out.println(i);
                sum =sum +i;





            }

        }
        System.out.println(sum);
        System.out.println(sum==noo ? "it is a perfect no" : "it is not a perfect no");

    }
}