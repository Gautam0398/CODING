import java.util.ArrayList;
import java.util.Scanner;

public class GetSub {

    public static ArrayList<String> gss(String s) {
        if (s.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("_");
            return bres;

        }

        char first = s.charAt(0);
        String rest = s.substring(1);

        ArrayList<String> rres = gss(rest);
        ArrayList<String> mres = new ArrayList<>();
        for (String ele : rres) {
            mres.add("_" + ele);
        }
        for (String ele : rres) {
            mres.add(first + ele);
        }
        return mres;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        ArrayList<String> res = gss(str);
        System.out.println(res);
    }
}
