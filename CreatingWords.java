
import java.util.Scanner;

public class CreatingWords {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  String a = sc.next();
                  String b = sc.next();
                  String newA = b.charAt(0) + a.substring(1);
                  String newB = a.charAt(0) + b.substring(1);
                  System.out.println(newA + " " + newB);
            }
      }
}
