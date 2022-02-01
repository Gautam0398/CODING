import java.util.*;

public class Chef2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char[] checker = { 'x', 'y' };
        int matching = 0;
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            str = str.toLowerCase();
            char[] c = str.toCharArray();
            Boolean[] paired = new Boolean[c.length];
            Arrays.fill(paired, false);
            for (int i = 0; i < c.length - 1; i++) {
                if (paired[i] == false) {
                    if (c[i] == checker[0] || c[i] == checker[1]) {
                        char ch = c[i];
                        if ((c[i + 1] == checker[0] || c[i + 1] == checker[1]) && c[i + 1] != ch) {
                            matching++;
                            paired[i] = true;
                            paired[i + 1] = true;

                        }
                    }
                }
            }

            System.out.println(matching);
            matching = 0;
            Arrays.fill(paired, false);
        }
    }
}

// ACCEPTED