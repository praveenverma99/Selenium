package Module001.Inheritance1;


import Module001.Inheritance.Class_1;
import Module001.Inheritance.Class_2;

public class Class_3   extends Class_2{

    public Class_3(double a, double b) {
        super(a, b);
    }

    public double area() {
        System.out.println("Area of Rectangle");
        return l*h;
    }

        public void m()
        {
            double m = 10;
            System.out.println(area());
            return ;
    }

    public  static void main(String[] args)
    {


          Class_1 f = new Class_1(10,3);
        Class_3 h = new Class_3(11,33);

        Class_2 g = new Class_2(11,33);

        System.out.println("Class_1 value :" + f.area());
        System.out.println("Class_2 value :" + g.area());
        System.out.println("Class_3 value :" + h.area());
            //         Class_3.m();
                     Class_2.k();
        Class_2 ss = new Class_3(11, 44);

        g.area();
        ss.area();
        ss.k();

                             h.m();
                            ((Class_3) ss).m();
                                h.k();
                                h.set();
    }

}
