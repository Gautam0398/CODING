public class checkSortA {
   public static boolean checkSort(int[] arr,int n){
       if(n == 0 || n == 1){
           return true;
       }

      if(arr[n-1]< arr[n-2]){
          return false;
      }

      return checkSort(arr,n-1);
   }

    public static void main(String args[]){
        int[] arr = {0,1,3,6,9};
        int n = arr.length;
        boolean res = checkSort(arr,n);
        System.out.println(res);

    }
}
