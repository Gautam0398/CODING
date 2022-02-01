import java.util.Scanner;
class AP3{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] a = new int[n];
        int[] f1 = new int[100005];
        boolean[] f2 = new boolean[100005];
        int[] f3 = new int[100005];
        boolean[] result = new boolean[n];
        
        for(int i=0;i<n;i++){
          a[i]=input.nextInt();
        }
        int j=0;
        int x = a[j];
        
        for(int i=0;i<n;i++){
          
              if(!f2[a[i]]){
                f2[a[i]] =true;
                f1[a[i]] = 0;
                f3[a[i]] = i;

              } else if( f1[a[i]]==0){
                   f1[a[i]] = i;
                   f3[a[i]] = i;                   
              } else if(f1[a[i]] >0){
                   if(i-f1[a[i]] != f1[a[i]])
                        f2[a[i]] =false;
              }
        }
    }
}