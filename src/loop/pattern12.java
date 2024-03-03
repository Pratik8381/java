package loop;

public class pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i<=5;i++){
            for (int s= 5-i; s>0; s--){
                System.out.print(" ");
            }
            for (int k= 1; k<= i; k++){
                System.out.print(""+" *"+" ");
            }
                System.out.println();}
        for (int i = 5; i>=1;i--){
            for (int s= 5-i; s>0; s--){
                System.out.print(" ");
            }
            for (int k= 1 ; k<= i; k++){
                System.out.print(""+" *"+" ");
            }
            System.out.println();}
    }
}