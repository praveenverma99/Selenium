package Module001.Inheritance;

import com.beust.ah.A;

public class Class_2 extends  Class_1{



    void Sum(){
    //    System.out.println("I+J+K : "+(i+j+k));
    }

    public static void main(String[] args) {

        Class_2 Class_2  = new Class_2();
        Class_1 Class_1 = new Class_1();

        Class_1.l = 10;
        Class_1.b = 20 ;
        Class_1.h=30;
        Class_1.size=100;
        Class_1.Showlbh();


        Class_2.l = 11 ;
        Class_2.b = 12 ;
        Class_2.h = 13;
        Class_2.Showlbh(20,30);
        Class_2.Showlbh(20,33,55);
    }
}
