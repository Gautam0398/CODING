import java.util.*;


public class AP {

    static int checkIsAP(int arr[], int n) 
    { 
        int d=0;
        if (n == 1) 
            return 0; 
        else{
            d = arr[1] - arr[0];
        }      
        for (int i = 2; i < n; i++) 
            if (arr[i] - arr[i-1] != d) 
                return -1; 
        return d; 
    }

 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
          while(t-- >0){         
            int n=input.nextInt();
            int count = 0;
            int x = 0;
            int[] a= new int[n];
            boolean[] visited = new boolean[100000];
            int[] element = new int[100000];
            Arrays.fill(element, -1);
            for(int i=0 ; i<n ; i++){
                a[i]=input.nextInt();
            }
            int[] temp=new int[n];
            
            int k=0;
            for(int i=0;i<n;i++){
                  x = a[i];
                  
                  k=0;
                  count = 0;
                  if(!visited[a[i]])
                  {
                            for(int j=0;j<n;j++)
                            {
    
                                if(x==a[j]){
                                    count++;
                                    temp[k++]=j;
                                }
                            }
                        int difference =checkIsAP(temp, count);  
    
                        System.out.println();
                        if(difference != -1)
                        {
                            element[a[i]] = difference;
                            // map.put(x, difference);
                        }
    
                  }
                  visited[a[i]]=true;
                  
                }
                for(int i=0 ; i<100000 ; i++){
                    if(element[i]!= -1)
                   System.out.println(i +" "+element[i]);
                }
          }

        } 
    }
