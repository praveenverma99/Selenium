package org.example.New.MissingNo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

                     int a [] = {100 , 20 , 500 , 60 , 12 , 10 } ;

                     System.out.println("Array Before Sorting : " + Arrays.toString(a));

                           for (int i=0 ; i<a.length-1 ;i++)
                           {
                               for (int j=0; j<a.length-1; j++)
                               {
                                      if(a[j] < a[j+1])
                                      {
                                             int temp = a[j];
                                             a[j] = a[j+1];
                                             a[j+1]= temp;

                                      }
                               }
                           }
                           System.out.println("After Sorting of the Array : " + Arrays.toString(a));
     }
}
