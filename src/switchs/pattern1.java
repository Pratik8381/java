package switchs;
//Assignment - 08
//Write a program to print number pattern using switch statement.
//1
//22
//333
//4444
//55555
public class pattern1 {
    public static void main(String[] args) {
int n =5;
        for (int i =1; i<=n; i++){
         for (int j=1; j<=i; j++)
            {
                switch (i) {
                    case 1:
                        System.out.print("1");
                        break;
                    case 2:
                        System.out.print("2");
                        break;
                    case 3:
                        System.out.print("3");
                        break;
                    case 4:
                        System.out.print("4");
                        break;
                    case 5:
                        System.out.print("5");
                        break;
                }

            }
            System.out.println();



            }



        }

    }

