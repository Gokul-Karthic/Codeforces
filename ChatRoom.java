
import java.util.Scanner;

public class ChatRoom {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String tar = "hello";
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                  if (s.charAt(i) == tar.charAt(j)) {
                        j++;
                  }
                  if (j == tar.length()) {
                        break;
                  }
            }
            if (j == tar.length()) {
                  System.out.println("yes");
            } else {
                  System.out.println("no");
            }
      }

}
