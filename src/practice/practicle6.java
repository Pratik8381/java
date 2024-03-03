package practice;

public class practicle6 {

    //- Assignment - 13
    //
    //    Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
    //
    //   E.g.- NUMBER : 12345 OUTPUT : 1+4=5
    public static void main(String[] args) {
        int no =12456;
//        int first = no/10000;
//                no = no%10000;
//        System.out.println(first);
//int second = no/1000;
//no= no%1000;
//        System.out.println(second);
//
//        int third =no/100;
//        no = no%100;
//        System.out.println(third);
//
//
//       int fourth = no/10;
//       no=no%10;
//        System.out.println(fourth);
//
//        int fifth =no/1;
//        no=no%1;
//        System.out.println(fifth);
//        System.out.println(first+fourth);
        //no =12456

        int first = (no/10000)%10;
        System.out.println(first);
        int second = (no/1000)%10;
        System.out.println(second);
        int third = (no/100)%10;
        System.out.println(third);
        int fourth = (no/10)%10;
        System.out.println(fourth);
        int fifth = no%10;
        System.out.println(fifth);
        System.out.println("the sum is");
        System.out.println(first+fourth
        );







    }
}
