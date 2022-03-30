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

        if(s.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = s.charAt(0);
        ArrayList<String> rres= getKP(s.substring(1,s.length()));

        ArrayList<String> mres= new ArrayList<>();
        String numVal = codes[ch-'0'];
        
            for(int i=0 ;i< numVal.length();i++){
              for(String val: rres){
                mres.add(numVal.charAt(i)+val);
               }
            }

        return mres;
        
    }
}
