package New;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {

        System.out.print("Plz input no. to check the no. is pallindrome or not : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Input no." + num);

        int rev = 0;
         int orignal_no = num;

        while ( num!=0) {

            rev = rev*10+ num%10;
            num = num/10;

             }
        System.out.println("Reverse of the no.: " +rev );
        System.out.println("num: " + num);

           if ( orignal_no == rev)
           {
               System.out.println("No. is Pallindrome ");
           }
           else
        {
            System.out.println("No. is not Pallindrome");
        }
    }


    }

