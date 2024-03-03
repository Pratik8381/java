package switchs;
//Assignment - 13
//Write a program to print number pattern using switch statement.
//5
//45
//345
//2345
//12345
public class pattern4 {
    public static void main(String[] args) {
       for (int i=1; i<=5; i++){

           for (int j=5-i+1; j<=5; j++)
           {
               switch (j)
               {
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
