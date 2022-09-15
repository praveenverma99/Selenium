package org.example.New.MissingNo;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String[] args) {
       /* System.out.println("size of string: ");
        Scanner scan = new Scanner(System.in);
            int z= scan.nextInt();
        String a[] = new String[z];

        for ( int i=0 ; i<z ; i++)
                 {
                     System.out.println("Enter value in String:" );
                     // String x = scan.nextLine();
                     a[i] = scan.nextLine();
                 }
        System.out.println(a.length);
                     for( int i= 0; i<a.length ; i++)
                     {
                         System.out.println(a[i]);

                        }  */

            String b[] = { "java" , "puch" , "java" , "no punch" , "JAVA"};

                    for ( int i =0; i<b.length ; i++)
                    {
                           for( int j=i+1; j< b.length; j++  )
                           {
                               if (b[i]==b[j])
                               {
                                   System.out.println("Duplicate value : " + b[i] + '\n' + "Index : " + i +" , "+ j);
                               }
                           }
                    }


    }
}
