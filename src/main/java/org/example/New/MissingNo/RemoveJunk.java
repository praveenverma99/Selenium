package org.example.New.MissingNo;

import java.lang.reflect.Array;

public class RemoveJunk {
    public static void main(String[] args) {

          String s = "@#$%^&*((  latin string 01234556789 ";
             s = s.replaceAll("[^a-zA-Z0-9]","a");
             System.out.println(s);

    }
}
