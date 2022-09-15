package org.example.New;

import java.util.Arrays;
import java.util.Collections;

public class SortInSystemMethod {
    public static void main(String[] args) {

                             Integer b[] = {100,20,35,15,7};

                             System.out.println("Before sorting array:" + Arrays.toString(b));
                            Arrays.parallelSort(b);
                             System.out.println("After parallelSort array:" + Arrays.toString(b));

                             Arrays.sort(b);
                             System.out.println("\nAfter sorting via sort:" + Arrays.toString(b));

                             Arrays.sort(b,Collections.reverseOrder());
                             System.out.println("\nReverse sort b,Collections.reverseorder():" + Arrays.toString(b));
    }
}
