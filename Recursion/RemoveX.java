import java.util.Scanner;

public class RemoveX {
    public static String removeX(String s) {
        if (s.length() == 0) {
            return s;
        }
        String ans = "";
        if (s.charAt(0) != 'x') {
            ans = ans + s.charAt(0);
        }
        String smallAns = removeX(s.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = removeX(str);
        System.out.println(result);
    }
}
