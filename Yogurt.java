import java.util.*;

public class Yogurt {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                  int n = sc.nextInt();
                  int a = sc.nextInt();
                  int b = sc.nextInt();

                  int pairCost = Math.min(2 * a, b);

                  int pairs = n / 2;
                  int single = n % 2;

                  int totalCost = pairs * pairCost + single * a;

                  System.out.println(totalCost);
            }
      }
}
