package shradha;

public class patterns {
    // solid rectangle
//            *****
//            *****
//            *****
//            *****

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //problem2
        //*****
        //*   *
        //*   *
        //*****
        System.out.println("pattern2");
        int n = 4; //row max
        int m = 5; //col max
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//pattern3
        //*
        //**
        //***
        //****
        //*****
        System.out.println("pattern3");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //pattern4
        //*****
        //****
        //***
        //**
        //*

        System.out.println("pattern4");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern5
        //   *
        //  **
        // ***
        //****
        System.out.println("pattern5");
        int no = 4;
        for (int i = 1; i <= no; i++) {

            for (int j = no - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        //pattern10
        int noo = 4;
        for (int i = 1; i <= noo; i++) {

            for (int j = noo - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();


        }
        //dimond
        for (int i = 3; i>=1; i--) {

            for (int j = noo - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();


        }

        //pattern10
        for (int i=1; i<=noo; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("New pattern");
//Next pattern

        for (int i=4; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //next pattern
        //1
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        int number =1;
        for (int i=1; i<=5;i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }}


