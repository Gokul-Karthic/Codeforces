import java.util.Scanner;

public class BlankSpace {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  int n = sc.nextInt();
                  int[] arr = new int[n];
                  for (int j = 0; j < n; j++) {
                        arr[j] = sc.nextInt();
                  }
                  int max = 0;
                  int count = 0;
                  for (int l : arr) {
                        if (l == 0) {
                              count++;
                        } else {
                              max = Math.max(max, count);
                              count = 0;
                        }
                  }
                  max = Math.max(max, count);
                  System.out.println(max);
            }

      }
}
