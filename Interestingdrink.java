import java.util.Arrays;
import java.util.Scanner;

public class Interestingdrink {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] prices = new int[n];

            for (int i = 0; i < n; i++) {
                  prices[i] = sc.nextInt();
            }

            Arrays.sort(prices);

            int q = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            while (q-- > 0) {
                  int m = sc.nextInt();

                  int left = 0, right = n;

                  while (left < right) {
                        int mid = left + (right - left) / 2;

                        if (prices[mid] <= m) {
                              left = mid + 1;
                        } else {
                              right = mid;
                        }
                  }

                  sb.append(left).append("\n");
            }

            System.out.print(sb);
      }
}
