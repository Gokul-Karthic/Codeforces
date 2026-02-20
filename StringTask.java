import java.util.Scanner;

public class StringTask {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                  char ch = Character.toLowerCase(s.charAt(i));

                  if (ch != 'a' && ch != 'o' && ch != 'y' &&
                              ch != 'e' && ch != 'u' && ch != 'i') {

                        ans.append('.').append(ch);
                  }
            }

            System.out.println(ans.toString());

      }

}
