
import java.util.Scanner;

public class InSearchofanEasyProblem {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                  int op = sc.nextInt();
                  sum += op;
            }
            if (sum > 0) {
                  System.out.println("HARD");
            } else {
                  System.out.println("EASY");
            }
      }

}
