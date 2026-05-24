import java.util.Scanner;

public class cAPSlOCK {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            if (s.substring(1).equals(s.substring(1).toUpperCase())) {
                  for (char ch : s.toCharArray()) {
                        if (Character.isUpperCase(ch))
                              System.out.print(Character.toLowerCase(ch));
                        else
                              System.out.print(Character.toUpperCase(ch));
                  }
            } else {
                  System.out.print(s);
            }
      }
}
