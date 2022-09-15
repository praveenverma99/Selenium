package org.example.New.MissingNo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWrite {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\prave\\OneDrive\\Desktop\\new.txt");
        BufferedWriter Bw = new BufferedWriter(fw);

                       Bw.write("a" + " ");
                       Bw.write("b" + " ");
                        Bw.write("c" + " ");
                        Bw.write("d" + " ");

                       System.out.println("Go Check the file .");
                      Bw.close();
     }
}
