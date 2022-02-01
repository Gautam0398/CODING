import java.util.*;
import java.io.*;

public class Main1 {
  public static void main(String args[]) throws IOException {

    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- > 0) {
      int n = input.nextInt();
      int flag = 0;
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          flag = 1;
        }
      }
      if (flag == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

  }
}