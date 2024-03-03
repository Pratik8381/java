package practice;

public class swapping {
    public static void main(String[] args) {
     int  a=12,b=20;
             //,temp;
//      temp=a;
//      a=b;
//      b=temp;
        //Without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Enter value of a="+a);
        System.out.println("Enter value of b="+b);
    }
}
