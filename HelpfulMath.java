
import java.util.Scanner;

public class HelpfulMath {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            StringBuilder res = new StringBuilder();
            int c1 = 0, c2 = 0, c3 = 0;
            for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);
                  if (ch == '1') {
                        c1++;
                  } else if (ch == '2') {
                        c2++;
                  } else if (ch == '3') {
                        c3++;
                  }
            }
            for (int i = 0; i < c1; i++) {
                  res.append("1+");
            }
            for (int i = 0; i < c2; i++) {
                  res.append("2+");
            }
            for (int i = 0; i < c3; i++) {
                  res.append("3+");
            }
            res.deleteCharAt(res.length() - 1);
            s = res.toString();
            System.out.println(s);

      }

}
