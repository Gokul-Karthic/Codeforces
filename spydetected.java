
import java.util.Scanner;

public class spydetected {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  int n = sc.nextInt();
                  int[] arr = new int[n];
                  for (int j = 0; j < n; j++) {
                        arr[j] = sc.nextInt();
                  }
                  int majority;
                  if (arr[0] == arr[1] || arr[0] == arr[2]) {
                        majority = arr[0];
                  } else {
                        majority = arr[1];
                  }
                  for (int k = 0; k < n; k++) {
                        if (arr[k] != majority) {
                              System.out.println(k + 1);
                        }
                  }
            }
      }

}
