import java.util.Scanner;

public class Bit {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  String op = sc.next();
                  switch (op) {
                        case "++X":
                              ++x;
                              break;
                        case "X++":
                              x++;
                              break;
                        case "--X":
                              --x;
                              break;
                        case "X--":
                              x--;
                              break;
                  }
            }
            System.out.println(x);

      }

}
