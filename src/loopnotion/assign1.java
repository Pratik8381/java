package loopnotion;

import java.util.Scanner;

//- **Assignment - 01**
//
//    Take 10 integers from keyboard using loop and print their average value on the screen.
public class assign1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);;
        int no;
        System.out.println("Enter the no");
        for (int i=1; i<=10;i++)
        {
            no= scanner.nextInt();
            System.out.println(no);

        }


    }

}
