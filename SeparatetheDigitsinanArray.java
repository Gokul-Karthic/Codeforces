
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SeparatetheDigitsinanArray {
      public static int[] separateDigits(int[] nums) {
            ArrayList<Integer> li = new ArrayList<>();
            for (int i = nums.length - 1; i >= 0; i--) {
                  while (nums[i] > 0) {
                        int temp = nums[i] % 10;
                        li.add(temp);
                        nums[i] = nums[i] / 10;
                  }
            }
            Collections.reverse(li);
            int[] result = new int[li.size()];
            for (int i = 0; i < li.size(); i++) {
                  result[i] = li.get(i);
            }
            return result;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            int[] ans = separateDigits(nums);
            for (int i : ans) {
                  System.out.println(i);
            }
      }

}
