
import java.util.Scanner;

public class VanyaAndFence {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int h = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                  if (arr[i] > h) {
                        res += 2;
                  } else {
                        res += 1;
                  }
            }
            System.out.println(res);

      }

}
