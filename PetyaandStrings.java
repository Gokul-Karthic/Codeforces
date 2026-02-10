import java.util.Scanner;

public class PetyaandStrings {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            // Convert both strings to lowercase
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            // Compare strings
            int result = s1.compareTo(s2);

            if (result < 0) {
                  System.out.println("-1");
            } else if (result > 0) {
                  System.out.println("1");
            } else {
                  System.out.println("0");
            }

            sc.close();
      }
}
