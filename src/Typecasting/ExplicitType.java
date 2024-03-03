package Typecasting;

public class ExplicitType {
    public static void main(String[] args) {
        short v1 = 128;
        byte v2 = (byte) v1;


        System.out.println("value of the v1"+v1);
        System.out.println("value of the v2"+v2);

        char v3 ='a';
        int v4 =v3;
        System.out.println("Enter value of variable 1"+v3);
        System.out.println("Enter value of variable 2"+v4);

    }
}
