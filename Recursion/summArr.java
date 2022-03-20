public class summArr {
    
    public static int sumArr(int[] arr,int n){
        if(n<0){
            return 0;
        }
        return arr[n] + sumArr(arr, n-1);
    }

    public static void main(String args[]){
        int[] arr = {9,8,9};
        int n = arr.length;
        int res = sumArr(arr,n-1);
        System.out.println(res);
    }

    
}
