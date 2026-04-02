import java.util.Scanner;

public class DivisibilityProblem {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int count = 0;
                  int remainder = a % b;
                  int result = (b - remainder) % b;
                  System.out.println(result);

            }
      }
}
