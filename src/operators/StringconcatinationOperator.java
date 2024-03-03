package operators;

public class StringconcatinationOperator {
    public static void main(String[] args) {

        System.out.println(10+20); //simple Mathematical addition
        System.out.println(10+"20"); //string concatimaton
        System.out.println(10+'A');//75
        System.out.println(10+"A");//10A
        System.out.println('A'+'A');//130
        System.out.println("A"+'A');//AA
        System.out.println('A'+'A'+"A");//130A
        System.out.println(10+"A"+ 20+30      );//10A2030
        System.out.println(10+"A"+(20+30));//10A50
        System.out.println((10+"A")+20+30);
        System.out.println((10+'A')+20+30);//10A2030

        System.out.println(10+'A');

    }
}
