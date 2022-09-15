package org.example.New;

public class ArraySum {
    public static void main(String[] args) {

               int a[] = {5,2,3,7};
               int sum = 0;
               int sum1 = 0;
                  for (int i=0; i<=a.length-1; i++)
                  {
                        sum = sum + a[i];
                  }
        System.out.println("Sum of all elements in array : "  + sum);
                  for( int value:a)
                  {
                      sum1 = sum1 + value;
                  }
        System.out.println("Enhanced Loop " + sum1);
    }
}
