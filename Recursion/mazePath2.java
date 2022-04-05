import java.util.ArrayList;
import java.util.Scanner;

public class mazePath2 {
    
    public static ArrayList<String> getMP(int sr,int sc,int dr,int dc){

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<dc){
             hpaths = getMP(sr, sc+1, dr, dc);
        }
        if(sr<dr){
             vpaths = getMP(sr+1, sc, dr, dc);
        }


        ArrayList<String> Mpaths = new ArrayList<>();


        for(String s : hpaths ){
            Mpaths.add("h"+s);
        }

        for(String s : vpaths ){
            Mpaths.add("v"+s);
        }

        return Mpaths;

    }



    public static void main(String gh[]){
        Scanner input = new Scanner(System.in);
        int sr = 1;
        int sc = 1;
        int dr = input.nextInt();
        int dc = input.nextInt();

        ArrayList<String> mazePaths = getMP(sr,sc,dr,dc);
        for(String str : mazePaths){
            System.out.println(str+ "$");
        }
        input.close();


    }
}
