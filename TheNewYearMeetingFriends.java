import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[3];

            for (int i = 0; i < 3; i++) {
                  arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int median = arr[1];
            int distance = Math.abs(median - arr[0])
                        + Math.abs(median - arr[1])
                        + Math.abs(median - arr[2]);

            System.out.println(distance);
      }

}
