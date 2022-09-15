package org.example.New.MissingNo;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

          /* FileReader fr = new FileReader("C:\\Users\\prave\\OneDrive\\Documents\\notepad..txt");
           BufferedReader br = new BufferedReader(fr);

             String str ;

                while ((str=br.readLine())!=null)
                {
                    System.out.println(str);
                }
               br.close(); */

          File file = new File("C:\\Users\\prave\\OneDrive\\Documents\\notepad..txt");
          Scanner scan = new Scanner(file);

                          while (scan.hasNextLine())
                          {
                              System.out.println(scan.nextLine());
                          }

                          scan.useDelimiter("\\z");
                           System.out.println(scan.next());
    }
}
