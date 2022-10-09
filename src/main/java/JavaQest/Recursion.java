package JavaQest;

public class Recursion {
               int func(int n)
               {
                   int result;
                   if ( n==1)
                       return  0;
                   result = func( n -1) ;
                   return  result;
               }
                  public static void main(String[] args) {
                         Recursion obj = new Recursion();
                        System.out.println(obj.func(5));
                    }
                }
