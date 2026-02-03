import java.util.Scanner;

public class codeforces_checking {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String cf = "codeforces";
            for (int i = 0; i < n; i++) {
                  String c = sc.next();
                  if (cf.contains(c)) {
                        System.out.println("YES");
                  } else {
                        System.out.println("NO");
                  }
            }
      }
}
