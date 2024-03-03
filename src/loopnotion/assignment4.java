package loopnotion;
//- **Assignment - 05**
//
//    Print multiplication table of 24, 50 and 29 using loop.
public class assignment4 {
    public static void main(String[] args) {
        int n1=24;
        int n2=50;
        int n3=29;
        int multiplication;
        System.out.println("Multipication table of 24");
        for (int i=1; i<=10; i++){
            multiplication=n1*i;
            System.out.println(multiplication);
        }
        System.out.println("Multipication table of 50");

        for (int i=1; i<=10; i++){
            multiplication=n2*i;
            System.out.println(multiplication);

        }
        System.out.println("Multipication table of 29");

            for (int i=1; i<=10; i++){
            multiplication=n3*i;
            System.out.println(multiplication);
        }
    }
}
