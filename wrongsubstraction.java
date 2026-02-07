
import java.util.Scanner;

public class wrongsubstraction {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                  if (z % 10 == 0) {
                        z = z / 10;
                  } else {
                        z = z - 1;
                  }

            }
            System.out.println(z);
      }

}
