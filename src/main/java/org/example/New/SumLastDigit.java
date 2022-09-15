package org.example.New;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumLastDigit {
    public static void main(String[] args) {

        System.out.print("Enter NO.: ");
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();

          int sum = 0;
           while (num>0 ){

                sum = sum + num%10;
                num = num/10;

        }
        System.out.print( sum);
    }
}
