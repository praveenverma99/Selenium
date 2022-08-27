package New.MissingNo;

import java.util.Scanner;

public class InArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the: ");
               int y = scanner.nextInt();
                int z = y+1;
                  int a[] = new int[z];
                    for ( int i=0; i<a.length ; i++ )
                    {
                        System.out.print("Enter Value in array : ");
                        a[i] = scanner.nextInt();
                    }


                                int max = 0;
                       for (int i =0; i<a.length; i++)
                       {
                           if(a[i]>max)
                           {
                               max = a[i];
                           }

                       }
                       System.out.print("Array made: ");
                       for(int i = 0; i<a.length; i++)
                       {
                           System.out.print(a[i] +" ");
                       }
                     System.out.print('\n' + "Max. No. in Array: " + max);

    }
}
