import java.util.Scanner;

public class DubStep {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String result = s.replaceAll("(WUB)+", " ").trim();
            System.out.println(result);

      }

}
