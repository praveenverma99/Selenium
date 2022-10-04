package Module001.Inheritance;

public class Test {

                    int a ,b ;
                 Test()
                 {
                   //  this(10,20);
                     System.out.println("No paramerter " + a +" "+ b );
                 }
                   Test(int a , int b)
                   {

                       System.out.println("With parameters " + a + " "+ b );
                   }

    public static void main(String[] args)
                {

                     Test tt = new Test();

                 }
}
