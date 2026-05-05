
import java.util.Scanner;

public class ANumberBetweenTwoOthers {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  long x = sc.nextLong();
                  long y = sc.nextLong();
                  if (y / x == 2) {
                        System.out.println("NO");
                  } else {
                        System.out.println("YES");
                  }
            }
      }

}
