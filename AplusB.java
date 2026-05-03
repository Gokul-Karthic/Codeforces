
import java.util.Scanner;

public class AplusB {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  String s = sc.next();
                  int a = Math.abs('0' - (int) s.charAt(0));
                  int b = Math.abs('0' - (int) s.charAt(2));
                  System.out.println(a + b);
            }

      }

}
