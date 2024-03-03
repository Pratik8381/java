package practice;

import java.util.Scanner;

public class charfirst {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string");
            String st = scanner.next();
            System.out.println("The entered string is"+st);
            char ch = st.charAt(0);
            System.out.println("The first letter of the string is: " + ch);
        }
    }

