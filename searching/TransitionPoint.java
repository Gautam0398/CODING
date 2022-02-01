import java.util.Scanner;
 class TranistionPoint {

    public static int getTP(int[] arr, int low, int high) {
        int mid = low + ((high-1)-low)/2;
        if(low > high)
          return -1;
        if(arr[mid]==1 && (mid==0 || arr[mid-1]==0))
        return mid;
        else if(arr[mid] == 0){
              return getTP(arr,mid+1,high);
        }
        else{
            return getTP(arr,low,mid-1);
        }
      
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int[] sortedArray = new int[n];
            for (int i = 0; i < sortedArray.length; i++) {
                sortedArray[i] = input.nextInt();
            }
            
            int elementIdx = getTP(sortedArray, 0, sortedArray.length);
            System.out.println(elementIdx);
        }
     
        input.close();
    }

}