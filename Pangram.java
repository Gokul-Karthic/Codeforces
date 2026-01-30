
import java.util.HashSet;
import java.util.Scanner;

public class pangram {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String str = sc.next();
            String lower = str.toLowerCase();

            HashSet<Character> map = new HashSet<>();
            for (char ch : lower.toCharArray()) {
                  if ((ch >= 'a') && (ch <= 'z')) {
                        map.add(ch);
                  }

            }
            if (map.size() == 26) {
                  System.out.println("YES");
            } else {
                  System.out.println("NO");
            }

      }
}
