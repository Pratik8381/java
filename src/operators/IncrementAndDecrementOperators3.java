package operators;

public class IncrementAndDecrementOperators3
{
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        System.out.println(a++ + ++b + --c + d++ + c++ + b++);
        System.out.println("The Value of a"+a);
        System.out.println("The Value of b"+b);
        System.out.println("The Value of c"+c);
        System.out.println("The Value of d"+d);
    }
}
