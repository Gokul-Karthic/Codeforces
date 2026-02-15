
import java.util.Scanner;

public class Word {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int upper = 0;
            int lower = 0;
            for (char c : s.toCharArray()) {
                  if (Character.isLowerCase(c)) {
                        lower++;
                  } else {
                        upper++;
                  }
            }
            if (upper > lower) {
                  s = s.toUpperCase();
            } else {
                  s = s.toLowerCase();
            }
            System.out.println(s);
      }
}