import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int flag = 0;
        int[] countChar = new int[26];
        while (t-- > 0) {
            String s = input.next();
            s = s.toLowerCase();
            char[] st = s.toCharArray();
            Arrays.sort(st);
            for (int i = 0; i < st.length; i++) {
                countChar[st[i] - 97]++;
            }

            for (int i = 0; i < 26; i++) {
                if (countChar[i] > 1) {
                    char c = (char) (i + 97);
                    System.out.print(c + " = " + countChar[i] + " ");
                    flag = 1;
                }

            }
            if (flag == 0) {
                System.out.println(-1);
            }
            Arrays.fill(countChar, 0);
            flag = 0;
            System.out.println();

        }

    }
}