import java.util.*;

public class mazePath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();// rows
        int m = input.nextInt();// cols

        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> paths = new ArrayList<>();

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        if (sr < dr) {
            hpaths = getMazePaths(sr + 1, sc, dr, dc);
        }
        if (sc < dc) {
            vpaths = getMazePaths(sr, sc + 1, dr, dc);
        }

        for (String path : hpaths) {
            paths.add('h' + path);
        }

        for (String path : vpaths) {
            paths.add('v' + path);
        }
        return paths;
    }
}
