package New;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Plz input no. be check: ");
        int num = scan.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("no. is prime");
            } else {
                System.out.println("non-prime");
            }
        }
    }
        }




