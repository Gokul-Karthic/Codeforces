import java.util.Scanner;

public class ChewbaccaNumber {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String n = sc.next();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n.length(); i++) {
                  char c = n.charAt(i);
                  int temp = c - '0';
                  int inverted = 9 - temp;
                  if (i == 0 && inverted == 0) {
                        ans.append(temp);
                  } else {
                        ans.append(Math.min(temp, inverted));
                  }
            }
            System.out.println(ans);
      }
}