
import java.util.*;

public class ArrivaloftheGeneral {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }

            int max = arr[0], min = arr[0];
            int maxIndex = 0, minIndex = 0;

            // Find max (first occurrence)
            for (int i = 0; i < n; i++) {
                  if (arr[i] > max) {
                        max = arr[i];
                        maxIndex = i;
                  }
            }

            // Find min (last occurrence)
            for (int i = 0; i < n; i++) {
                  if (arr[i] <= min) {
                        min = arr[i];
                        minIndex = i;
                  }
            }

            int moves = maxIndex + (n - 1 - minIndex);

            if (maxIndex > minIndex) {
                  moves--;
            }

            System.out.println(moves);
      }
}
