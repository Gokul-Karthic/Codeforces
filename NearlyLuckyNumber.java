
import java.util.Scanner;

public class NearlyLuckyNumber {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            String s = Long.toString(n);
            int count = 0;
            for (char ch : s.toCharArray()) {
                  if ((ch == '4') || (ch == '7')) {
                        count++;
                  }
            }
            if ((count == 7) || (count == 4)) {
                  System.out.println("YES");
            } else {
                  System.out.println("NO");
            }
      }

}
