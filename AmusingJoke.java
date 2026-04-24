import java.util.Scanner;

public class AmusingJoke {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String guest = sc.nextLine();
            String host = sc.nextLine();
            String pile = sc.nextLine();
            int[] count = new int[26];
            for (char ch : (guest + host).toCharArray()) {
                  count[ch - 'A']++;
            }

            for (char ch : pile.toCharArray()) {
                  count[ch - 'A']--;
            }

            for (int i = 0; i < 26; i++) {
                  if (count[i] != 0) {
                        System.out.println("NO");
                        return;
                  }
            }

            System.out.println("YES");
      }

}
