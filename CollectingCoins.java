import java.util.Scanner;

public class CollectingCoins {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  long a = sc.nextLong();
                  long b = sc.nextLong();
                  long c = sc.nextLong();
                  long n = sc.nextLong();
                  long max = Math.max(a, Math.max(b, c));
                  long need = max - a + max - b + max - c;
                  if (need <= n && (n - need) % 3 == 0) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }
      }
}
