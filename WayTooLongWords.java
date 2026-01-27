
import java.util.Scanner;

public class WayTooLongWords {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  String ch = sc.next();
                  if (ch.length() > 10) {
                        int size = ch.length() - 2;
                        String ans = "" + ch.charAt(0) + size + ch.charAt(ch.length() - 1);
                        System.out.println(ans);
                  } else {
                        System.out.println(ch);
                  }

            }

      }

}
