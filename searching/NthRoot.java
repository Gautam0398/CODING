public class NthRoot{
    public static double multiply(double m, double limit){
        int limit1 = (int)limit;
        System.out.println("limit1"+limit1);
        double ans = 1.0;
        for(int i =1 ;i<=limit1;i++){
            ans = ans* m;
            System.out.println(ans);
        }
        return ans;
    }

   public static double getNth(double n,double m){
       double start = 1.0;
       double end = m;
       double eps = 1e-6;
     
       System.out.println("eps"+eps);
       
       while( (end-start)>eps ){
       double mid = (start + end)/2.0;
        if(multiply(mid,n)<m){
           start = mid;
        }else{
            end = mid;
        }
       }

       return start;
   }


    public static void main(String args[]){
        double n = 3;
        double m = 27;
        double result = getNth(m,n);
        System.out.println(result);
    }

}