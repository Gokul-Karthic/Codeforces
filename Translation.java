
import java.util.Scanner;

public class Translation {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String r = sc.next();
            String rev = new StringBuilder(s).reverse().toString();
            if (r.equals(rev)) {
                  System.out.println("YES");
            } else {
                  System.out.println("NO");
            }

      }
}
