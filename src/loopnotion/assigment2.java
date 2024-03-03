package loopnotion;
//Assignment - 03
//Print the following patterns using loop :
//	*
// ***
//*****
// ***
//  *
public class assigment2 {
    public static void main(String[] args) {
        int no=3;
        for (int i=1; i<=no; i++){
            for (int s= no-i; s>0;s--){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int noo=3;
        for (int i=noo-1; i>0; i--){
            for (int s= noo-i; s>0;s--){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
