package New.MissingNo;

import java.util.Scanner;

public class InArray {
    public static void main(String[] args) {

           //    int a[] = {10,20,30,100,50};
                  int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
                    for ( int i=0; i<a.length ; i++ )
                    {
                        System.out.println("Enter Value in array ");
                        int n = scanner.nextInt();
                        a[i] = n;
                    }


                     int max = 0;
                       for (int i =0; i<a.length; i++)
                       {
                           if(a[i]>max)
                           {
                               max = a[i];
                           }

                       }
                     System.out.println(max);

    }
}
