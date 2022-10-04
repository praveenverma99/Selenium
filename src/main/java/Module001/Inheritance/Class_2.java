package Module001.Inheritance;

public class Class_2 extends  Class_1{

    public Class_2(double a, double b)
    {
        super(a, b);
    }
           public double area()
                 {
                     System.out.println("Area of Triangle");
                     return l+h;
                 }

                   protected static void k(){

                       System.out.println("kk");
                       return ;
                   }
    public static void main(String[] args) {

                  Class_2.k();
    }
}

