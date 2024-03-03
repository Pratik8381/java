package operators;

public class IncrementAndDecrementOperators2 {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        int c= ++a + b++ + --a + ++b + a++;
        System.out.println("Enter value of the c"+c);
        System.out.println("Enter value of the a"+a);
        System.out.println("Enter value of the b"+b);
    }
}
