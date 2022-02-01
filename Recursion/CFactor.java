import java.util.*;
import java.io.*;

public class CFactor {
    public static void Solve(int n, int p, String str) {
        if (n == 1) {
            System.out.println(str);
            return;
        } else {
            for (int i = p; i <= n; i++) {
                if (n % i == 0) {
                    Solve(n / i, i, str + i + " ");
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int p = 2;
            String str = "1 ";
            Solve(n, p, str);
        }
        input.close();
    }

}

// ACCEPTED