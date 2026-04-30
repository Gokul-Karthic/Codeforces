
import java.util.Scanner;

public class PartyMonster {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int l = sc.nextInt();
                  String s = sc.next();
                  int c1 = 0;
                  int c2 = 0;
                  for (char c : s.toCharArray()) {
                        if (c == '(') {
                              c1++;
                        } else {
                              c2++;
                        }
                  }
                  if (c1 == c2) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }
      }
}
