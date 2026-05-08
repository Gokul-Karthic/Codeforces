
import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                  arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i <= n - m; i++) {
                  int diff = arr[i + m - 1] - arr[i];
                  minDiff = Math.min(minDiff, diff);
            }
            System.out.println(minDiff);
      }
}
