import java.util.*;

public class getKPC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        ArrayList<String> words = getKP(str);
        System.out.println(words);

    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

    public static ArrayList<String> getKP(String s) {
        if (s.length() == 0) {
            ArrayList<String> brs = new ArrayList<>();
            brs.add("");
            return brs;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);

        ArrayList<String> rres = getKP(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];

        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }
}
