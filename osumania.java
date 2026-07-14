
import java.util.Scanner;

public class osumania {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int[] arr = new int[n];
                  for (int i = 0; i < n; i++) {
                        String s = sc.next();
                        for (int j = 0; j < 4; j++) {
                              if (s.charAt(j) == '#') {
                                    arr[i] = j + 1;
                                    break;
                              }
                        }
                  }
                  for (int i = n - 1; i >= 0; i--) {
                        System.out.println(arr[i]);
                  }
            }

      }
}
