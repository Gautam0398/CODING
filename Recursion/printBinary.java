import java.util.ArrayList;
import java.util.Scanner;

public class printBinary {
    

    public static ArrayList<String> printBinary(int n){
        
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;

        }

        ArrayList<String> rres = printBinary(n-1);
        ArrayList<String> mres = new ArrayList<>();
        for(String element : rres){
            mres.add("0 "+element);
        }
        for(String element : rres){
            mres.add("1 "+element);
        }


        return mres;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            ArrayList<String> rres= printBinary(n);
            for (String str : rres) {
                System.out.println(str);
            }
            
        
        input.close();
    }
}
