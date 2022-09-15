package org.example.New.MissingNo;
import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.IStringConverterFactory;
import com.sun.tools.javac.Main;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.*;
import static jdk.internal.vm.vector.VectorSupport.test;

public class Java_001 {

    public static void main(String[] args) {

         Scanner s = new Scanner(in);
       out.print("Plz enter word to be reversed : ");
           String str = s.nextLine();
      /*  String str = "Praveen";
        String rev = " ";

        int len = str.length();

        for (int i= len-1; i>=0; i--) {

            rev = rev+str.charAt(i);
            } */
         ;
       //`  Array b[10] = [a,2,3];

         char a[] = str.toCharArray();
           int len=a.length;
           String rev = " ";

           for ( int i= len-1; i>=0; i--)
           {
                  rev = rev+ a[i];
           }
        out.println("Reverse : " + rev);
    }


}
