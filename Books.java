
import java.util.Scanner;

public class Books {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            if (n == 1 && arr[0] <= t) {
                  System.out.println(1);
                  return;

            }
            int sum = 0;
            int j = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                  sum += arr[i];
                  if (sum > t) {
                        sum -= arr[j];
                        j++;
                  }
                  max = Math.max(max, i - j + 1);

            }
            System.out.println(max);
      }

}
