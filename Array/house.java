import java.util.*;
  import java.io.*;
  
 class house {
    public static void main(String args[]) throws IOException {
        int n1=-1,n2=-1;
        int count=0;
        Scanner input = new Scanner(System.in);
        
        int t= input.nextInt();
        while(t-->0){
          int n= input.nextInt();
          int[] a = new int[n];
          boolean[] result = new boolean[n];
          
          for(int i=0;i<n;i++){
            a[i]=input.nextInt();
          }
          
          for(int i=0;i<n;i++){
              int x=a[i];
             if(i==0)
             {
               n1=a[i+1];
               n2=-1;
             }
             else if(i==n-1){
               n1=a[i-1];
               n2=-1;
             }
             else{
               n1 = a[i+1];
               n2 = a[i-1];
             }
             
             if(a[i]>n1 && a[i]>n2){
                System.out.print(i + " ");
                count++;
             }
             if(count == 0)
             System.out.print(-1);
          }
        //   for(int i=0;i<n;i++){
        //    if(result[i] == true){
        //      System.out.print(i + " ");
        //    }
        //   }
          
        }
      
    }
  }