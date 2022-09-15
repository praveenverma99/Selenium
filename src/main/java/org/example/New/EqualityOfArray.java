package org.example.New;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualityOfArray {
    public static void main(String[] args) {

                    int a[] = {1,2,3,4};
                    int b[] = {1,2,3,5};

              /*      boolean check = Arrays.equals(a,b);
        //System.out.println(check);
                 if( check==true)
                 {
                     System.out.println("Equal");
                 }
                else
                 {
                     System.out.println("Not Equal");
                 }   */

                boolean status = true;
                if (a.length == b.length) {
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != b[i]) {
                            status = false;
                        } else {
                            status = false;
                        }
                    }
                }
                if ( status == true)
                          {
                              System.out.println("Equal");
                          }
                          else
                          {
                              System.out.println("false");
                          }
                      }
                }


