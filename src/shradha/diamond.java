package shradha;

public class diamond {
    public static void main(String[] args) {
        int n=5;
        for (int i= 1; i<=n; i++){
            for (int j = n-i; j>=1; j--)
            {
                System.out.print(" ");

            }
            for (int k =1; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i= 5; i>=1; i--){
            for (int j = n-i; j>=1; j--)
            {
                System.out.print(" ");

            }
            for (int k =1; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
