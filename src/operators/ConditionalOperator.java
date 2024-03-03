package operators;

public class ConditionalOperator {
    static public  void main(String args []) {
      int  Number1 =100;
        int  Number2 =63;
        int  Number3 =9;
        System.out.println(Number1>Number2 && Number1>Number3 ? Number1
                :Number2>Number1 && Number2>Number3 ? Number2 : Number3);

    }
}
