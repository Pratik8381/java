package operators;

public class bitwiseoperator
{
    public static void main(String[] args) {
        //bitwise and operator
        System.out.println(4&5);
        System.out.println(41&3);
        System.out.println(34&5);


        //bitwise or operator
        System.out.println(14|15);
        System.out.println(41|3);
        System.out.println(34|5);
        //bitwise Xor operator
        System.out.println(4^5);
        //Bitwise left shift
        System.out.println(4<<1);
        System.out.println(4<<2);
        System.out.println(4<<3);
        System.out.println(12<<3);



        //Bitwise Right shift operator
        System.out.println(4>>1);

        System.out.println(4>>2);
        System.out.println(4>>3);
        System.out.println(12>>3);
        //Bitwise negation operator
        System.out.println(~5);

    }
}
