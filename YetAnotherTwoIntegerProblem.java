import java.util.Scanner;

public class YetAnotherTwoIntegerProblem {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while (n-- > 0) {
                  long a = sc.nextLong();
                  long b = sc.nextLong();
                  long diff = Math.abs(a - b);
                  long moves = (diff + 9) / 10;
                  System.out.println(moves);
            }
      }
}