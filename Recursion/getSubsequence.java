import java.util.ArrayList;

public class getSubsequence {
    

    public static ArrayList<String> gss(String s){
        if(s.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("_");
            return bres;
        }
        
        char ch = s.charAt(0);
        ArrayList<String> rres = gss(s.substring(1));
        ArrayList<String> mres = new ArrayList<>();

        for (String string : rres) {
           mres.add("_"+string) ;
        }
        
        for (String string : rres) {
            mres.add(ch+string) ;
        }

        return mres;

    }


    public static void main(String gh[]){
        String str = "abc";
        ArrayList<String> res = gss(str);
        for(String ele: res){
            System.out.println(ele);
        }


    }
}
