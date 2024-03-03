package switchs;
//Assignment - 10
//Write a program to print number pattern using switch statement.
//1
//23
//456
//7890
public class patteren3 {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            switch ( i)
            {
                case 1 :
                    System.out.println("1");
                    break;
            case 2 :
                    System.out.println("23");
                    break;
            case 3 :
                    System.out.println("456");
                    break;
            case 4 :
                    System.out.println("7890");
                    break;
            }
        }

    }
}
