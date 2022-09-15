package Module001.Inheritance;

import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;

 class Class_1 {

        double l;
     double b;

      double h;

        double size;
             void Showlbh(){
                 System.out.println(l + b +h);
             }
     void showlbh(double size)
     {
         System.out.println("size :" + size);
     }
     void Showlbh(double l, double b)
     {
         System.out.println("Area :" + l*b);
     }

     void Showlbh( double l,double b, double h) {
           System.out.println(" Volume :" + l*b*h);
       }


 }