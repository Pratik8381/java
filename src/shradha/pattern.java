package shradha;

public class pattern {
    public static void main(String[] args) {
        //Write a program to print number pattern using switch statement.
        //1
        //22
        //333
        //4444
        //55555
//        int no =5;
//        for (int i= 1; i<=no; i++)
//        {
//            for (int j=1 ; j<=i; j++){
//                System.out.print(i);
//
//            }
//            System.out.println();
//        }
        //Write a program to print number pattern using switch statement.
        //1
        //01
        //101
        //0101
        //10101
//        int no =5;
//        for (int i=1; i<=no ; i++){
//
//            for (int j = 1; j<=i; j++){
//                if ((i+j)%2==0){
//
//                    System.out.print("1");
//                }
//                else {
//                    System.out.print("0");
//                }
//
//            }
//            System.out.println();
//        }
        //Write a program to print number pattern using switch statement.
        //1
        //23
        //456
        //7890
//        int no =4;
//        int counter =1;
//        for (int i=1; i<=no; i++){
//            for (int j =1 ; j<=i; j++){
//                System.out.print(counter+" ");
//                counter++;
//            }
//            System.out.println();
//        }
        //Write a program to print number pattern using switch statement.
        //1
        //10
        //101
        //1010
        //10101
//        int no=5;
//        for(int i=1; i<=no; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j%2==0 ? "0": "1");
//            }
//            System.out.println();
//        }
       //Write a program to print number pattern using switch statement.
        //1
        //2 1
        //3 2 1
        //4 3 2 1
        //5 4 3 2 1
//        int no =5;
//        for (int i=1; i<=no; i++){
//            for (int j=i;j>0; j-- ){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//Write a program to print number pattern using switch statement.
//1234
//2345
//3456
//4567

//        int no =4;
//        int counter =1;
//        for (int i=1; i<=no; i++){
//            int st=i;
//            for (int j=1; j<=no; j++){
//
//                System.out.print(st);
//                st++;
//
//
//            }
//            System.out.println();
//        }
        //Write a program to print number pattern using switch statement.
        //12345
        //23456
        //34567
        //45678
        //56789
//        int no =5;
//        for (int i=1; i<=no;i++){
//            int o=i;
//            for (int f=1; f<=no; f++){
//                System.out.print(o);
//                o++;
//            }
//            System.out.println();
//
//        }
        //Write a program to print number pattern using switch statement.
        //1
        //2 1
        //3 2 1
        //4 3 2 1
        //5 4 3 2 1
        //4 3 2 1
        //3 2 1
        //2 1
        //1

//        int n1=5;
//        int n2=4;
//        for (int i=1; i<=n1;i++){
//            for (int j =i;j>0;j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        for (int i=n2-1; i>0;i--){
//            for (int j =i;j>0;j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //Write a program to print number pattern using switch statement.
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5
        //4 4 4 4
        //3 3 3
        //2 2
        //1
        int n1=5;
        int n2=4;
        for (int i=1; i<=n1;i++){
            for (int j =i;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i=n2-1; i>0;i--){
            for (int j =i;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
