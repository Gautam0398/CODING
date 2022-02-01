import java.util.Scanner;

public class BNsearch {


    public static int Bsearch(int[] a,int start ,int end,int element){
        int mid = (start+(end-1))/2;


        if(start > end-1){
            return -1;
        }
        if(element == a[mid]){
            return mid;
        }else if(element < a[mid]){
            return Bsearch(a,start,mid-1,element);
        }else{
            return Bsearch(a,mid+1,end,element);
        }
        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int resultIndex = Bsearch(arr,0,n,23);
        System.out.println(resultIndex);    

    
    }

     
}

    
