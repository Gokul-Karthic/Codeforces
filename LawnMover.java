import java.util.Scanner;

public class LawnMover {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                  long n = sc.nextLong();
                  long w = sc.nextLong();

                  long result = n - (n / w);

                  System.out.println(result);
            }
      }

}
