package operators;

public class logicaloperators3 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        System.out.println(num1>=num2 && num2<=num3);
        System.out.println(num1<=num2 || num2>=num3);
        System.out.println(num1>=num2 || (num2!=num3));

    }
}
