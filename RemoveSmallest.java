
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  int n = sc.nextInt();
                  int[] arr = new int[n];
                  for (int k = 0; k < n; k++) {
                        arr[k] = sc.nextInt();
                  }
                  Arrays.sort(arr);
                  boolean possible = true;
                  for (int j = 1; j < n; j++) {

                        if ((arr[j] - arr[j - 1]) > 1) {
                              possible = false;
                              break;
                        }
                  }
                  if (possible) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }

      }
}
