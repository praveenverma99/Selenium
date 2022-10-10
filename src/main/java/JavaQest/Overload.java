package JavaQest;

public class Overload {
            int x;
                double y;

                 void add(int a, int b)
                 {
                     x = a+b;
                 }
                  void add (double c, double d)
                  {
                      y = c+d;
                  }
                   Overload()
                   {
                        this.x= 0;
                        this.y =0;
                   }


                           public static void main(String[] args)
                           {

                               Overload object = new Overload();
                               int a=2;
                               double b = 3.2;
                               object.add(a,a);
                               object.add(b,b);
                               System.out.println(object.x + " " + object.y);
                           }
                       }

