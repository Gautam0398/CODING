public class allIndices {
 
    public static int[] findAllIndices(int[] arr,int x,int idx,int fsf){
        if(idx == arr.length){
            int[] iarr = new int[fsf];
            return iarr;
        }

        if(arr[idx] == x){
            int[] iarr = findAllIndices(arr, x, idx+1, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }else{
            int[] iarr = findAllIndices(arr, x, idx+1, fsf);
            return iarr;
        }

    }


    public static void main(String args[]){
        int[] arr = {9,8,9,10,0,0,8,999,9};
        int x = 9;
        int[] res = findAllIndices(arr,x,0,0);
        for(int i=0;i<res.length;i++){
            System.out.print("  "+res[i]);
        }
    }
}
