import java.util.Scanner;

public class socks {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int diffDays = Math.min(a, b);
            int sameDays = (Math.max(a, b) - diffDays) / 2;

            System.out.println(diffDays + " " + sameDays);
      }

}
