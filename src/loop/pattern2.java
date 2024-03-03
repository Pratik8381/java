package loop;

import java.util.Scanner;

public class pattern2 {
 //   1
 //   1 2
 //  1 2 3
 // 1 2 3 4
 //1 2 3 4 5

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a no");
  int n = scanner.nextInt();
 for (int i=1; i<=n; i++)
 {
  for (int j= i; j<=n-1; j++) {
   System.out.print(" ");
  }
   for (int k =1 ; k<=i; k++){
    System.out.print(k+" ");

   }
  System.out.println();
 }

 }
 }


