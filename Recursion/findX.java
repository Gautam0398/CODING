public class findX {

    public static int finder(int[] arr,int idx,int x){
        if(idx == arr.length){
            return -1;
        }
        if(x == arr[idx]){
            return idx;
        }
        return finder(arr, idx+1,x);
    }
    
    public static void main(String args[]){
        int[] arr = {19,8,9};
        int x = 9;
        int res = finder(arr,0,x);
        System.out.println(res);
    }
}
