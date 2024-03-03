package loop;
//    1
//   1 2
//  1 2 3
// 1 2 3 4
//1 2 3 4 5
// 4 3 2 1
//  3 2 1
//   2 1
//    1
public class pattern11 {
    public static void main(String[] args) {
//        for (int i =1; i<=5; i++){
//            for (int k =5-i; k>=1; k--){
//                System.out.print(" ");
//            }
//            for (int j= 1; j<=i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        for (int i=1 ; i<=5; i++){
//            //space
//            for (int f=5-i; f>=1; f--){
//                System.out.print(" ");
//            }
//            for (int j =1; j<=i; j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        for (int i= 4 ; i>=1; i--){
//            for (int k= 4-i; k>=1; k--){
//                System.out.print(" ");
//            }
//            for (int j= i ; j>=1; j--){
//                System.out.print(" "+j);
//            }
//            System.out.println();
//        }
        for (int i= 1; i<=5; i++)
        {
            for (int k =5-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i= 4 ; i>=1; i--){
            for (int k= 4-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j= i ; j>=1; j--){
                System.out.print(" "+j);
            }
            System.out.println();


        }
    }
}
