import java.util.*;

public class getStairPaths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> mres = getPaths(n);
        System.out.println(mres);
    }

    public static ArrayList<String> getPaths(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getPaths(n - 1);
        ArrayList<String> paths2 = getPaths(n - 2);
        ArrayList<String> paths3 = getPaths(n - 3);
        ArrayList<String> rres = new ArrayList<>();

        for (String path : paths1) {
            rres.add(1 + path);
        }
        for (String path : paths2) {
            rres.add(2 + path);
        }
        for (String path : paths3) {
            rres.add(3 + path);
        }

        return rres;
    }
}
