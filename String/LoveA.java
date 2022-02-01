import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            String s = input.next();
            s = s.toLowerCase();
            int n = s.length();
            int aCount = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a')
                    aCount++;
            }

            if (aCount > n / 2) {
                System.out.println(n);
            } else {

                while (n > 0) {
                    int a = n--;
                    if (aCount > a / 2) {
                        System.out.println(a);
                        break;
                    }
                }
            }

        }

    }

}
// ACCEPTED