package New;

public class OddEvenArrayCount {
    public static void main(String[] args) {

              int a[] = {1,2,3,4,5,6,11};
                   int even = 0;
                   int odd = 0;

                for( int i=0; i<=a.length-1; i++)
                {
                          int b = a[i];
                           if(b%2==0) {
                                  even++;
                           }

                            else
                    {
                          odd++;
                    }


                }
        System.out.println("No. of even no. :" + even);
        System.out.println("No. of odd no. :" + odd);
    }
}
