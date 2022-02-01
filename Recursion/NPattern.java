import java.util.*;

public class NPattern {

    public static void buildPattern(int n, int m, boolean flag) {

        System.out.print(m + " ");

        if (flag == false && n == m)
            return;

        if (n == 0 && flag == true) {
            return;

        } else {
            buildPattern(n, m - 5, false);
        }

        if (flag) {

            if (m - 5 > 0)
                buildPattern(n, m - 5, true);
            else
                buildPattern(n, m - 5, false);
        }

        else
            buildPattern(n, m + 5, false);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int check = n;
            buildPattern(n, check, true);

        }
    }
}

// ACCEPTED