import java.util.Scanner;

public class Die_roll {
      static int gcd(int a, int b) {
            if (b == 0) {
                  return a;
            }
            return gcd(b, a % b);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int Y = sc.nextInt();
            int W = sc.nextInt();

            int max = Math.max(Y, W);

            int numerator = 7 - max;
            int denominator = 6;

            int g = gcd(numerator, denominator);

            System.out.println((numerator / g) + "/" + (denominator / g));
      }
}
