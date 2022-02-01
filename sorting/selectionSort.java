import java.util.Scanner;

public class selectionSort{



    public static int[] selectionSort(int[] a){
     
        for(int i = 0 ;i < a.length -1 ;i++){
            int min = a[i];
            int minIndex = i;
            for(int j=i+1;j< a.length;j++){
                if(a[j]<min){
                   min = a[j];
                   minIndex = j;
                }
            }
            if(minIndex != i){

                a[minIndex] = a[i];
                a[i] = min;
            }
        }

        return a;

    }
    public static void main(String arg[]){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
         int n = input.nextInt();
         int[] arr = new int[n];
        System.out.println("enter the elements");
        
        for(int i=0; i<n;i++){
            arr[i] = input.nextInt();
        }

        int[] result = selectionSort(arr);
        for(int i=0; i<n;i++){
         System.out.print(result[i]);
        }

    }

    
}