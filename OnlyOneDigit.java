import java.util.Scanner;

public class OnlyOneDigit {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                  int num = sc.nextInt();
                  int min = 9;
                  while (num > 0) {
                        int temp = num % 10;
                        num /= 10;
                        min = Math.min(min, temp);
                  }
                  System.out.println(min);
            }
      }

}
