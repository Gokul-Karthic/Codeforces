import java.util.Scanner;

public class LoveStory {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                  String s = sc.next();
                  String t = "codeforces";
                  int count = 0;
                  int i = 0;
                  while (i < 10) {
                        if (s.charAt(i) != t.charAt(i)) {
                              count++;
                        }
                        i++;
                  }
                  System.out.println(count);
            }
      }

}
