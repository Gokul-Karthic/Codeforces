
import java.util.Scanner;

public class WordCapitalization {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            StringBuilder res = new StringBuilder();
            res = res.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                  res = res.append(s.charAt(i));
            }
            s = res.toString();
            System.out.println(s);
      }

}
