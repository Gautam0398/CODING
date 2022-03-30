public class lasrOccur {
 

    public static int findLastOccurence(int[] arr, int idx,int x){
        if(idx == arr.length){
            return -1;
        }
        int losa = findLastOccurence(arr, idx+1, x);
        if(losa == -1){
            if(arr[idx]== x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return losa;
        }
    }


      

    public static void main(String args[]){
        int[] arr = {9,8,9,10,0,0,8,999,9};
        int x = 9;
        int res = findLastOccurence(arr,0,x);
        System.out.println(res);
    }
}
