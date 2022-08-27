package New.MissingNo;

public class InArray {
    public static void main(String[] args) {

               int a[] = {10,20,30,100,50};
                     int max = 0;
                       for (int i =0; i<a.length; i++)
                       {
                           if(a[i]>max)
                           {
                               max = a[i];
                           }

                       }
                     System.out.println(max);

    }
}
