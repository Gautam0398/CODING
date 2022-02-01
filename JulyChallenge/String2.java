import java.util.*;

class String2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int diff = 0;

            int[] guitarStrings = new int[n];

            for (int i = 0; i < n; i++) {
                guitarStrings[i] = input.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                if (guitarStrings[i] > guitarStrings[i + 1]) {
                    diff += guitarStrings[i] - guitarStrings[i + 1] - 1;
                } else {
                    diff += guitarStrings[i + 1] - guitarStrings[i] - 1;
                }
            }

            System.out.println(diff);
        }

    }
}