package loopnotion;

import java.util.Scanner;

//Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.
public class asignment9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String no;
        int sum=0;
int avg=0;
int nos;
int count=0;
int product=1;
        while (scanner.hasNextInt()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum = sum + num;
                product = product * num;
                count++;
            } else if (scanner.hasNext("q")) {
                scanner.nextInt();

                break;

            }

            if (count > 0) {
                nos = sum / count;
                System.out.println(nos);
            }

            System.out.println(product);


        }


        }

    }

