import java.util.Scanner;

public class NewYearandHurry {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int totalMinutes = 240;
            int availableTime = totalMinutes - k;

            int solved = 0;
            int timeSpent = 0;

            for (int i = 1; i <= n; i++) {
                  timeSpent += 5 * i;
                  if (timeSpent <= availableTime) {
                        solved++;
                  } else {
                        break;
                  }
            }

            System.out.println(solved);
      }

}
