import java.util.ArrayList;

public class arrSubset {
    public static ArrayList<ArrayList<Integer>> getSubset(int[] a){
        if(a.length == 0){
            // ArrayList<Integer> bres1 = new ArrayList<>();
            // bres1.add(a[0]);
            ArrayList<Integer> bres2 = new ArrayList<>();
            ArrayList<ArrayList<Integer>> mbres = new ArrayList<>();
            mbres.add(bres2);
            return mbres;

        }
       
        int element = a[0];
        int[] smallarr = new int[a.length-1];
        for(int i=0;i<smallarr.length;i++){
            smallarr[i] = a[i+1];
        }
        ArrayList<ArrayList<Integer>> rres = getSubset(smallarr);
        ArrayList<ArrayList<Integer>> mres = new ArrayList<>();

        for(ArrayList<Integer> arrL : rres){
            ArrayList<Integer> newL = new ArrayList<>();
            for(int ele: arrL){
                newL.add(ele);
            }
            newL.add(0,element);
            mres.add(newL);
        }
        for(ArrayList<Integer> arrL : rres){
            mres.add(arrL);
        }

        return mres;
        

    }



    public static void main(String gh[]){
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> result = getSubset(arr);
        for(ArrayList<Integer> val : result){
            System.out.println(val);
        }

    }
}
