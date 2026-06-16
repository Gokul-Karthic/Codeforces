import java.util.Scanner;

public class Boring_Apartments {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                  String x = sc.next();

                  int d = x.charAt(0) - '0';
                  int len = x.length();

                  int answer = (d - 1) * 10 + len * (len + 1) / 2;

                  System.out.println(answer);
            }

            sc.close();
      }
}
