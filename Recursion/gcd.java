import java.util.*;

class gcd {

  public static int gcde(int a, int b) {
    if (b == 0)
      return a;
    return gcde(b, a % b);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int t = input.nextInt();

    while (t-- > 0) {
      int n = input.nextInt();
      int p = input.nextInt();
      int result = gcde(n, p);

      System.out.println(result);
    }
    input.close();
  }
}

// ACCEPTED