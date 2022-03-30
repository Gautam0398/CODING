public class add2 {

    public static int[] getArrSum(int[] a1,int[] a2){

        int i = a1.length-1;
        int j = a2.length-1;
        int k  = i>j ? i:j;
        int[] sum = new int[k+1];

        int c =0;

        while(k>=0){
           int d =0;
           d+=c;
           if(i>=0){
               d+=a1[i];
           }

           if(j>=0){
               d+=a2[j];
           }

           c = d/10;
           d = d%10;

           sum[k] = d;
           k--;
           i--;
           j--;
        }

        return sum;
    }

    public static void main(String gh[]){

        int[] a1 = {1,2,3,4};
        int[] a2 = {6,7,8};

        int[] sum  = getArrSum(a1,a2);
        for(int val : sum){
            System.out.print(val+" ");
        }

    }
}
