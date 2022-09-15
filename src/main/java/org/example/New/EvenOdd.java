package org.example.New;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Enter no. : ");
        Scanner scan = new Scanner(System.in);

           int num = scan.nextInt();
           int even =0, odd = 0 ;

            while ( num >0) {

                    int rem = num%10;
                    num = num/10;
                System.out.print("rem: " + rem +" " );
                System.out.print("num: " + num + '\n');
                if ( rem%2==0)  {
                    even++;
                }
                 else {
                     odd++;
                }
            }
        System.out.println("No. off Even digit: " + even + "\n" +"No. off Odd digit: " + odd);
    }
}
