import java.util.Scanner;
public class Merge2{
  
    public static int[] getSorted(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        int n= a.length+b.length;
        
        int i=0;
        int j=0;
        int k =0;
        
              while (i< a.length && j<b.length){
                if(a[i] < b[j]){
                    result[k] = a[i];
                    i++;
                    k++;
                 }else{
                     result[k] = b[j];
                    j++;
                    k++;
                 }
              }

              while(i< a.length){
                  result[k] = a[i];
                  i++;
                  k++;
              }
              while(j< b.length){
                result[k] = b[j];
                j++;
                k++;
            }
            
        
        return result;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[]{3,5,7,9};
        int[] arr2 = new int[]{1,2,3,4};

        int[] result = getSorted(arr1,arr2);
        for(int i =0;i< result.length ;i++){
            System.out.println(result[i]);
        }
    }
}