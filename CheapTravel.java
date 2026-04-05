
import java.util.Scanner;

public class CheapTravel {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int op1 = n * a;
            int full = (n / m) * b;
            int rem = Math.min(n % m * a, b);
            int op2 = full + rem;
            System.out.println(Math.min(op1, op2));
      }
}
