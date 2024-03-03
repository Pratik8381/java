package loop;
//    *
//   **
//  ***
// ****
//*****
public class pattern9 {
    public static void main(String[] args) {
        for (int i =1; i<=5; i++){

            //spaces
            for (int sp=5-i;sp>0; sp--){
                System.out.print(" ");
            }
            for (int f =1; f<=i; f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=5; i++){
            //space
            for (int k= 5-i; k>0; k--){//main logic
                System.out.print(" ");
            }
            for (int f=1 ; f<=i; f++){
                System.out.print(f);}
            System.out.println();
        }


    }
}
