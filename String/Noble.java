import java.util.*;
import java.io.*;

public class Noble {

    public static boolean VowelCheck(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }

    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int flag = 0;
        int i = 0;
        while (t-- > 0) {
            System.out.println("enter " + t + "string");
            String s = input.next();
            s = s.toLowerCase();
            for (i = 0; i < s.length() - 1; i++) {
                if (!VowelCheck(s.charAt(i)) && s.charAt(i) != 'n') {
                    if (!VowelCheck(s.charAt(i + 1)) && s.charAt(i) != 'n') {
                        flag = 1;
                        break;
                    }
                }
            }
            if (i == s.length() - 1 && (!VowelCheck(s.charAt(i)) && s.charAt(i) != 'n')) {
                flag = 1;
            }

            if (flag == 0)
                System.out.println("YES");
            else
                System.out.println("NO");

            flag = 0;
        }

    }
}