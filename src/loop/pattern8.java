package loop;
//1
//10
//101
//1010
//10101
public class pattern8 {
    public static void main(String[] args) {
        for (int i= 1; i<=5; i++){//for the rows
            for (int f = 1; f<=i ; f++){
                System.out.print(f%2==0 ? 0:1);
            }
            System.out.println();
        }
    }
}
