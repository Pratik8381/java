package loopnotion;
//Write a program to print all prime number in between 1 to 100.
public class assignmentno14 {
    public static void main(String[] args) {


     for (int i=2; i<=100; i++){
         boolean isaprime = true;
         for (int j=2; j<=i/2;j++){
             if (i%j==0){
                 isaprime = false;
                 break;
             }

         }
         if (isaprime){
             System.out.println(i);
         }
     }
    }
}