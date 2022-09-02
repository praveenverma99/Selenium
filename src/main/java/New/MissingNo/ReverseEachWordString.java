package New.MissingNo;

public class ReverseEachWordString {
    public static void main(String[] args) {

                   String str = "Welcome to Java";

                    String word[] = str.split(" ");

                     String reverseString = "";

                     for(String x:word)
                     {
                               String reverseword= "";

                                for( int i = word.length-1; i>=0;i--)
                                {
                                     reverseword= reverseword+ x.charAt(i);
                                }
                                reverseString= reverseString+reverseword+" ";
                     }
                            System.out.println(reverseString);

                   /*        String ntr = "Welcome to java";
                          String sword[] = ntr.split("\\s");

                              String reverseword="";
                              for (String a: sword)
                              {
                                  StringBuilder sb = new StringBuilder(a);
                                  sb.reverse();
                                  reverseword=reverseword+sb.toString()+" ";
                              }
                                  System.out.println(reverseword); */
    }
}
