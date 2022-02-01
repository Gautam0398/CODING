import java.util.*;

public class Chatur {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            String s = input.next();
            int n = s.length();
            int Operations = 0;

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(n - i - 1))
                    continue;

                if (s.charAt(i) < s.charAt(n - i - 1)) {
                    Operations += (int) s.charAt(n - i - 1) - (int) s.charAt(i);
                } else {
                    Operations += (int) s.charAt(i) - (int) s.charAt(n - i - 1);
                }
            }
            System.out.println(Operations);
        }

    }
}

// ACCEPTED