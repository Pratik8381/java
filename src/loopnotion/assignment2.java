package loopnotion;
//Assignment - 02
//Print the following patterns using loop :
//a.
//*
//**
//***
//****
public class assignment2 {
    public static void main(String[] args) {
        int no=4;
        for (int i=1; i<=no; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
