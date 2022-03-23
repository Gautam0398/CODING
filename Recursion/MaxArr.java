public class MaxArr {

    public static int findMax(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = findMax(arr, idx+1);
        if(arr[0]> misa){
            misa = arr[0];
            return misa;
        }else{
            return misa;
        }
    }
    public static void main(String args[]){
        int[] arr = {12,8,2};
        int  res = findMax(arr,0);
        System.out.println(res);
    }
}
