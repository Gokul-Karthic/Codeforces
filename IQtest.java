
import java.util.Scanner;

public class IQtest {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int oc = 0;
            int ec = 0;
            for (int i : arr) {
                  if (i % 2 == 0) {
                        ec++;
                  } else {
                        oc++;
                  }
            }
            if (ec > oc) {
                  for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0) {
                              System.out.println(i + 1);
                              break;
                        }

                  }
            } else {
                  for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                              System.out.println(i + 1);
                              break;
                        }

                  }

            }
      }
}
