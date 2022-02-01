import java.util.*;

public class Password {

    public static ArrayList<String> genPassword(int n) {
        if (n == 1) {
            ArrayList<String> br = new ArrayList<>();
            br.add("1");
            br.add("2");
            br.add("3");
            br.add("4");
            br.add("5");
            br.add("6");
            br.add("7");
            br.add("8");
            br.add("9");
            return br;
        }

        ArrayList<String> rres = genPassword(n - 1);
        ArrayList<String> mres = new ArrayList<>();
        for (String ele : rres) {
            for (int i = 1; i <= 9; i++) {
                mres.add(ele + i);
            }
        }
        return mres;
        /// logic for length more than 2

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> rres = genPassword(num);
        System.out.println(rres);
    }
}
