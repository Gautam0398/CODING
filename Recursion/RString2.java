import java.util.*;

public class RString2 {
    public static void reverse(String s, int index) {

        if (!(index > s.length() - 1)) {
            reverse(s, index + 1);
            System.out.print(s.charAt(index));
        } else {
            return;
        }
    }

    public static void main(String gh[]) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        reverse(s, 0);
        input.close();
    }

}