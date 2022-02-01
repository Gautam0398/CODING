import java.util.Scanner;

class Matrix {

    int[][] multiply(int[][] a,int[][] b,int a1,int a2,int b1,int b2){
            int c[][] = new int[a1][b2];

            for(int i=0;i<a1;i++){
                for(int j=0;j<b2;j++){
                    for(int k=0;k<b1;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
           return c;
    }

    int[][] add(int[][] a,int[][] b,int a1,int a2,int b1,int b2){
        int c[][]= new int[a1][b2];

        
        for(int i=0;i<a1;i++){
            for(int j=0;j<b2;j++){
                    c[i][j]=a[i][j]+b[i][j];
            }
        }
       return c;
    }
    

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        Matrix mobj=new Matrix();
            System.out.println("enter no of rows and columns of first matrix");
            int m=input.nextInt();
            int n=input.nextInt();
            System.out.println("enter no of rows and columns of Second matrix");
            int a1=input.nextInt();
            int b1=input.nextInt();
            int[][] q1=new int[m][n];
            int[][] q2=new int[a1][b1];
            int[][] result=new int[m][b1];
            int[][] result2=new int[m][n];
          
             /**
              * Multiplcation only if col -no. of 1st equal  row no.-2
               */   
             
              if(n==a1){
             
             
                System.out.println("enter elements of first matrix");
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        q1[i][j]=input.nextInt();
    
                    }
                }
                System.out.println("enter elements of Second matrix");
                for(int i=0;i<a1;i++){
                    for(int j=0;j<b1;j++){
                        q2[i][j]=input.nextInt();
                        
                    }
                }
                System.out.println("*************************MAtrix Multplicaion****************************");       
               result=mobj.multiply(q1,q2,m,n,a1,b1);
               for(int i=0;i<m;i++){
                for(int j=0;j<b1;j++){
                 System.out.print(result[i][j] + " ");
                }
                System.out.println("");
            }
              }
              else{
                System.out.println("Matrix multiplication is not possible");
                input.close();
                return;
              }
              if(m == a1){
                  if(n == b1){
                    System.out.println("*************************MAtrix addition****************************");  
                    result2=mobj.add(q1, q2, m, n, a1, b1);
                    for(int i=0;i<m;i++){
                        for(int j=0;j<b1;j++){
                         System.out.print(result2[i][j] + " ");
                        }
                        System.out.println("");
                    }
                  }
                  else{
                    System.out.println("Matrix Addition is not possible");
                    input.close();
                    return;
                  }
                  
              }
              else {
                System.out.println("Matrix Addition is not possible");
                input.close();
                return;
              }
  


            input.close();

        }
    
}