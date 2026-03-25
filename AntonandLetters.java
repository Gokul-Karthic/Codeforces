
import java.util.HashSet;
import java.util.Scanner;

public class AntonandLetters {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            HashSet<Character> set = new HashSet<>();
            for (char ch : s.toCharArray()) {
                  if (ch >= 'a' && ch <= 'z') {
                        set.add(ch);
                  }
            }
            System.out.println(set.size());
      }

}
