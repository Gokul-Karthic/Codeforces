import java.util.Scanner;

public class RequiredRemainder {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                  long x = sc.nextLong();
                  long y = sc.nextLong();
                  long n = sc.nextLong();

                  long k = n - (n % x) + y;

                  if (k > n) {
                        k -= x;
                  }

                  System.out.println(k);
            }

            sc.close();
      }
}
