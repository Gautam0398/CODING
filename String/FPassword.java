import java.util.*;

public class FPassword {

    public static String leftrotate(String a, int r) {

        String ans = a.substring(r) + a.substring(0, r);
        return ans;

    }

    static String rightrotate(String str, int d) {
        return leftrotate(str, str.length() - d);
    }

    public static void main(String gh[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int d = 2;

        while (t-- > 0) {
            String s1 = input.next();
            String s2 = input.next();
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            String ls = leftrotate(s2, d);
            String rs = rightrotate(s2, d);

            if (s1.equals(rs) || s1.equals(ls)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}