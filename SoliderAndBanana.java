import java.util.Scanner;

public class SoliderAndBanana {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int n = sc.nextInt();
            int w = sc.nextInt();
            int totalcost = ((w * (w + 1)) / 2) * k;
            int ans = totalcost - n;
            System.out.println(ans);

      }

}
