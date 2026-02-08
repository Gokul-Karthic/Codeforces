
import java.util.Scanner;
public class TheatreSquare {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextInt();
            long m = sc.nextInt();
            long a = sc.nextInt();
            long l = (n + a - 1) / a;
            long w = (m + a - 1) / a;
            long total = l * w;
            System.out.println(total);

      }

}
