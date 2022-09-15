package org.example.New.MissingNo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
           int a ;
          int b  ;
           int c ;
        System.out.println("Plz enter value to be reversed a : ");
        Scanner s = new Scanner(System.in);
         a = s.nextInt();
        System.out.println("Plz enter value to be reversed b : ");
        b = s.nextInt();

   //     System.out.println("Value input " + a + " "+ b);

            c=a ;
           a=b;
           b = c;
        System.out.println("new a: " + a );
        System.out.println("new b: "+ b);

    }
}
