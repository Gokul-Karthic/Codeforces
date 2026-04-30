
import java.util.Scanner;

public class Koshary {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int x = sc.nextInt();
                  int y = sc.nextInt();
                  if (x % 2 != 0 && y % 2 != 0) {
                        System.out.println("NO");
                  } else {
                        System.out.println("YES");
                  }
            }
      }
}
