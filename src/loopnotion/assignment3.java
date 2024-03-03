package loopnotion;
//Print the pattern
//
//1010101
// 10101
//  101
//   1
public class assignment3 {
    public static void main(String[] args) {
        int no=5;
        for (int i= no -1; i>0; i--){
            for (int j =no-i; j>0; j-- ){
                System.out.print(" ");

            }
//            for (int j= 1; j<=(i*2)-1; j++){
            for (int j= 1; j<=(i*2)-1; j++){

               if (j%2==0){
                   System.out.print("0"+" ");
               }
               else {
                   System.out.print("1"+" ");
               }
            }
            System.out.println();
        }


    }
}
