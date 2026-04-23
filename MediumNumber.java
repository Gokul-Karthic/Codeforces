import java.util.Scanner;

public class MediumNumber {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t-- > 0) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int c = sc.nextInt();

                  int median = a + b + c - Math.min(a, Math.min(b, c)) - Math.max(a, Math.max(b, c));
                  System.out.println(median);
            }

            sc.close();
      }

}
