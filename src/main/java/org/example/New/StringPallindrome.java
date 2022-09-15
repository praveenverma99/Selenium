package org.example.New;

import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {

        System.out.println("Enter Word to be checked: ");
        Scanner scan = new Scanner(System.in);
        String  str = scan.nextLine();
        System.out.println("Sting :" + str);

        String org = str ;
        String rev = "";
         int len = str.length();
           for (int i=len-1; i>=0; i-- )
           {

                  rev=rev+ str.charAt(i);

           }
        System.out.println("Sting Reverse:" + '\n' + rev);

        if ( org.equals(rev)) {
             System.out.println("Pallindrome String");
         }
          else {
             System.out.println("Not a pallindrome");
         }
    }
}
