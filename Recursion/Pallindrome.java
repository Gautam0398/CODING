import java.util.*;

public class Pallindrome {

    public static boolean checker(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return checker(s.substring(1, s.length() - 1));
        return false;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            boolean result = checker(s);
            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}

// ACCEPTED