package shradha;

public class pattern2 {
    public static void main(String[] args) {
//        int n = 4;
//        for (int i=1; i<=n; i++){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(n-i);
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            for (int j= 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=4; i>=1; i--){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(n-i);
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            for (int j= 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int no = 4;
        for (int i = 1; i <= no; i++) {
            for (int f = 1; f <= i; f++) {
                System.out.print("*");
            }
                int space = 2 * (no - i);
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();


        }
        for (int i = 4; i >0; i--) {
            for (int f = 1; f <= i; f++) {
                System.out.print("*");
            }
            int space = 2 * (no - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }}
