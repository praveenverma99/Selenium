package New;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First no. :");
         int a = scan.nextInt();
        System.out.println("Enter second no. :");
        int b = scan.nextInt();
        System.out.println("Enter third no. :");
        int c = scan.nextInt();

           if ( a>b && a >c) {
               System.out.println("Largest no. is :" +a);
           }
           else if (b>a && b>c ) {
               System.out.println("Largest no. is :" +b);
           }
           else{
               System.out.println("largeest no. is :"+ c);
           }
           int large = a>b?a:b;
           int large1 = c>large?c:large;
        System.out.println("largest:" + large1  );

    }
}
