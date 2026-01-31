
import java.util.Scanner;

public class sum {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int c = sc.nextInt();
                  if (a + b == c) {
                        System.out.println("Yes");
                  } else if (b + c == a) {
                        System.out.println("Yes");
                  } else if (c + a == b) {
                        System.out.println("Yes");
                  } else {
                        System.out.println("No");
                  }

            }
      }

}
