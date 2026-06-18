import java.util.Scanner;

public class Desorting {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            for (int tc = 0; tc < t; tc++) {
                  int n = sc.nextInt();
                  long[] a = new long[n];

                  for (int i = 0; i < n; i++) {
                        a[i] = sc.nextLong();
                  }

                  long ans = Long.MAX_VALUE;

                  for (int i = 0; i < n - 1; i++) {
                        long diff = a[i + 1] - a[i];

                        if (diff < 0) {
                              ans = 0;
                              break;
                        }

                        ans = Math.min(ans, diff / 2 + 1);
                  }

                  System.out.println(ans);
            }

            sc.close();
      }
}
