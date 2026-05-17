import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class twins {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            Integer[] coins = new Integer[n];

            int total = 0;

            for (int i = 0; i < n; i++) {
                  coins[i] = sc.nextInt();
                  total += coins[i];
            }

            Arrays.sort(coins, Collections.reverseOrder());

            int mySum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                  mySum += coins[i];
                  count++;

                  if (mySum > total - mySum) {
                        break;
                  }
            }

            System.out.println(count);
      }

}
