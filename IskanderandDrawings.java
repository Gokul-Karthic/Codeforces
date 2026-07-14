import java.util.Scanner;

public class IskanderandDrawings {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  int n = sc.nextInt();
                  String s = sc.next();
                  int ans = 0;
                  int cnt = 0;
                  for (int j = 0; j < n; j++) {
                        if (s.charAt(j) == '#') {
                              cnt++;
                        } else {
                              ans = Math.max(ans, (cnt + 1) / 2);
                              cnt = 0;
                        }
                  }

                  ans = Math.max(ans, (cnt + 1) / 2);

                  System.out.println(ans);
            }

      }
}
