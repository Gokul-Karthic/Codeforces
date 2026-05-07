
import java.util.Scanner;

public class VladandtheBestofFive {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  String s = sc.next();
                  int a = 0;
                  int b = 0;
                  for (char ch : s.toCharArray()) {
                        if (ch == 'A') {
                              a++;
                        } else {
                              b++;
                        }
                  }
                  if (a > b) {
                        System.out.println('A');
                  } else {
                        System.out.println('B');
                  }
            }
      }
}
