
import java.util.Scanner;

public class Marathon {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int count = 0;
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int c = sc.nextInt();
                  int d = sc.nextInt();
                  if (b > a)
                        count++;
                  if (c > a)
                        count++;
                  if (d > a)
                        count++;
                  System.out.println(count);

            }

      }
}