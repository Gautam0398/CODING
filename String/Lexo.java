import java.util.*;

public class Lexo {
    static void reverse(char[] a) {
        int i, n = a.length;
        char t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            char[] st = s.toCharArray();
            Arrays.sort(st);
            reverse(st);
            System.out.println(st);
        }
    }
}