public class GeoSum {
    public static double geo(int k){
        if(k ==0){
            return 1;
        }
        double powered = 1/Math.pow(2, k);
        return powered + geo(k-1) ;
    }

    public static void main(String gh[]){
        int k = 0 ;
        double res  = geo(k);
        System.out.println(res);

    }
}
