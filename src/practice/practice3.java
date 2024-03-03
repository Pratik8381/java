package practice;

public class practice3 {
    public static void main(String[] args) {
        //- Assignment - 01
        //    - Length and breadth of a rectangle are 5 and 7 respectively.
        //    - Write a program to calculate the area and perimeter of the rectangle.
        long a= 5;
        long b=7;
        long perimeter =  2 * ( a + b );
        System.out.println("Area of the rectangle");
        System.out.println(a*b);
        System.out.println("perimeter of the rectangle");
        System.out.println(+perimeter);
        //- Assignment - 02
        //    - Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
    int c =2;
    int d =3;
    int e =5;
    int perimeteroft =c+d+e;
        System.out.println("perimeter of triangle"+perimeteroft);
//- Assignment - 03
//    - Write a program to add 8 to the number 2345 and then divide it by 3.
//    - Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
//    - Display the final result.

//        int f =8;
//        int i =2345;
//        int add = f+i;
//        System.out.println("The addition is"+add);
//
//        int k = add / 3;
//        System.out.println("The division is"+k);
//        int l =k%5;
//        System.out.println("The Mod is"+l);
//        int m = l*5;
//        System.out.println("The Final answer is"+m);

        //Assignment - 04

        //Now, solve the above question[Assignment - 03] using assignment operato**rs (eg. +=, -=, *=).**

        int f =8;
        int i =2345;
        int add = f+=i;
        System.out.println("The addition is"+add);

        int k = add /=3;
        System.out.println("The division is"+k);
        int l =k%=5;
        System.out.println("The Mod is"+l);
        int m = l*=5;
        System.out.println("The Final answer is"+m);


        //- Assignment - 05
        //
        //    Write a program to check if the two numbers 23 and 45 are equal.

        //assignment operators
        System.out.println(23==45);

        //- Assignment - 06
        //
        //    Write a program to print the power of 7 raised to 5.

        double r = Math.pow(7,5);
        System.out.println("Result is ="+r);

        //- Assignment - 07
        //
        //    Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
//int v= 55;
//int z=70;
//        System.out.println(a < 50 && a < b);



        //- Assignment - 08
        //
        //    Now solve the above question[assignment - 07] to check if at-least one of the conditions 'a < 50' or 'a < b' is true.

        int v= 55;
        int z=70;
        System.out.println(a < 50 || a < b);

        //- Assignment - 09
        //
        //    If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.

int w= 78;
int ok=45;
int op=62;
 double Total = (w+ ok + op)/300.00;
 double Percentage = Total*100;
        System.out.println("The total percentage  of the students ="+Percentage);


//- Assignment - 10
//
//    Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
//
//    1 - first program by using a third variable
//
//    2 - second program without using any third variable
//
//    ( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)






    }
}
