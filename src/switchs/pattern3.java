package switchs;
//Write a program to print number pattern using switch statement.
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class pattern3 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                switch (j){
                    case 1 :
                        System.out.print("1");
                        break;
                     case 2 :
                        System.out.print("2");
                        break;
                     case 3 :
                        System.out.print("3");
                        break;
                     case 4 :
                        System.out.print("4");
                        break;
                     case 5 :
                        System.out.print("5");
                        break;

                }
            }
            System.out.println();
        }

        }

}
