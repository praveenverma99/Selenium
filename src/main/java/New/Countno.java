package New;

import java.util.Scanner;

public class Countno {
    public static void main(String[] args) {
        System.out.print("Input NO. of which length to be find: ");
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();

              int count = 0;

              while ( n>0) {

                      n=n/10;
                      count++;
              }
        System.out.println("Length of input: " + count);
    }
}
