import java.util.ArrayList;
import java.util.*;

class XY {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // char[] checker = { 'x', 'y' };
        // char[] temp = new char[2];
        String checker = "xy";
        int matching = 0;
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();

            int size = 2;

            List<String> tokens = new ArrayList<>();

            for (int start = 0; start < str.length(); start += size) {
                tokens.add(str.substring(start, Math.min(str.length(), start + size)));
            }

            for (int j = 0; j < tokens.size(); j++) {
                if (tokens.get(j).equals(checker)) {
                    matching++;
                }
            }

            System.out.println(matching);

            System.out.println(tokens);

        }
    }
}