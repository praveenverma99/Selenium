package org.example.New;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int a = scan.nextInt();
                long factorial =1;
                for (int i=a; i>=1; i--  ) {

                        factorial =factorial* i;

                }
        System.out.println("Factorial of the no. " + factorial );
    }
}
