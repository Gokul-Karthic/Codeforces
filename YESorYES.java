
import java.util.Scanner;

public class YESorYES {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                  String ch = sc.next();
                  if (ch.toLowerCase().equals("yes")) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }

            }
      }
}