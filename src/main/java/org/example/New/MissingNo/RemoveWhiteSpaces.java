package org.example.New.MissingNo;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = "JAVA  programming  selenium    automation";

               str= str.replaceAll("\\s", " ");

                     System.out.println(str);
      }
}
