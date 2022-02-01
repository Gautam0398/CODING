import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = s.toUpperCase();
        int flag = 0;
        char[] buf = s.toCharArray();

        for (int i = 0; i < buf.length; i++) {
            if (buf[i] == 'X') {
                if (buf[i + 1] == 'Y') {
                    flag++;
                    i = i + 2;
                }
            } else if (buf[i] == 'Y') {
                if (buf[i + 1] == 'X') {
                    flag++;
                    i = i + 2;
                }
            } else {
                flag = 0;
            }
        }
        System.out.println(flag);
    }
}