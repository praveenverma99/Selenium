package New.MissingNo;

public class CharCount {
    public static void main(String[] args) {

           String s = "Java programing Java OOPS";

              int total_count = s.length();
           System.out.println(total_count);

                int total_count_removal = s.replace("a","").length();
                System.out.println(total_count_removal);

                   int count = total_count - total_count_removal;
                 System.out.println("\nNo. Of a:" + count);
     }

}
