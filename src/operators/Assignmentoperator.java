package operators;

public class Assignmentoperator {
    public static void main(String[] args) {
        int a =12;
        int b=23;
        int c = a;
        int d = a *2;
        int e =12;
        int var3 = add(10,20);
        System.out.println("Enter value of a"+a);
        System.out.println("Enter value of b"+b);
        System.out.println("Enter The Value of C"+c);
        System.out.println("Enter value of d"+d);
//        System.out.println(d=100);
//        System.out.println(100=d);/*left side always be contain the Variable,compile time error
        System.out.println("the value of the var3="+var3);


    }

    private static int add(int Number1, int Number2) {
        return Number1 + Number2;
    }


}
