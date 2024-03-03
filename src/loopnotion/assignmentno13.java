package loopnotion;

import java.util.Scanner;

public class assignmentno13 {
    public static void main(String args[]){

     int digit;
     int sum;
     int c;
     for (int i=1;i<=500;i++){
         sum =0;
         c=i;
         while (c>0){
             digit= c%10;
             sum= (digit*digit*digit)+sum;
             c= c/10;
             if (sum==i){
                 System.out.println(i);

             }
         }

     }

    }
}
