
import java.util.Scanner;

public class PrependandAppend {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  int n = sc.nextInt();
                  String s = sc.next();
                  int ans = n;
                  int l = 0;
                  int r = n - 1;
                  while (l <= r) {
                        if ((s.charAt(l) == '1' && s.charAt(r) == '0')
                                    || (s.charAt(l) == '0') && (s.charAt(r) == '1')) {
                              ans -= 2;
                              l++;
                              r--;
                        } else {
                              break;
                        }
                  }
                  System.out.println(ans);
            }
      }
}
