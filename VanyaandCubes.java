
import java.util.Scanner;

public class VanyaandCubes {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 1) {
                  System.out.println(1);

            } else {
                  int count = 0;
                  int sum = 1;
                  int i = 1;
                  int total = 1;
                  while (total <= n) {
                        count++;
                        i++;
                        sum = sum + i;
                        total += sum;

                  }
                  System.out.println(count);

            }

      }
}