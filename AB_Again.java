
import java.util.Scanner;

public class AB_Again {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int x = sc.nextInt();
                  int a = x % 10;
                  int b = x / 10;
                  System.out.println(a + b);
            }

      }
}
