public class MaxArr {

    public static int findMax(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = findMax(arr, idx+1);
        if(arr[idx]> misa){
            misa = arr[idx];
            return misa;
        }else{
            return misa;
        }
    }
    public static void main(String args[]){
        int[] arr = {12,8,22};
        int  res = findMax(arr,0);
        System.out.println(res);
    }
}
