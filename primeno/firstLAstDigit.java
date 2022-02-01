import java.util.*;
import java.io.*;

public class firstLAstDigit {
    public static boolean checkPrime(int n) {
        boolean flag = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;

    }

    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int k = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int digits = (int) (Math.log10(n));
            int first = (int) (n / Math.pow(10, digits));
            int last = n % 10;

            if (checkPrime(first) && checkPrime(last) && (last + first) > k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
