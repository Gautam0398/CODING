import java.util.*;

class RString {

    public static void revString(String s) {
        if (s == "" || s.length() <= 1) {
            System.out.println(s);
        } else {
            System.out.print(s.charAt(s.length() - 1));
            revString(s.substring(0, s.length() - 1));
        }

    }

    public static void main(final String gh[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {

            String s = input.next();
            revString(s);

        }
        input.close();
    }
}
