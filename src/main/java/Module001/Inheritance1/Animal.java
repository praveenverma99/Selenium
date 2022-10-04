package Module001.Inheritance1;

import org.openqa.selenium.json.JsonOutput;

public class Animal {

    String color = "Black";
    void No() {
        System.out.println("" + color);
    }

    public static class Dog extends Animal {
        String color = "white";

        void Dog() {
           System.out.println("" + color);
            //System.out.println("" + super.color);
          // super.No();
          // this.color;
              return ;
         }
             void yes ()
             {

                 super.No();
                 this.No();
             }
    }

    public static void main(String[] args) {

        Dog dd = new Dog();
        dd.Dog();
             //  Animal aa = new Animal();
             //     aa.No();
    }
}