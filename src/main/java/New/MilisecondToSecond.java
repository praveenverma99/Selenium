package New;

import java.util.Scanner;

public class MilisecondToSecond {
    public static void main(String[] args) {

        System.out.println("Enter millisecond : ");
           Scanner scan = new Scanner(System.in);
             double a = scan.nextInt();
             double b = a/1000;
        System.out.println("Second :" + b);
    }
}
