public class multiply {
    
    public static int multiply2(int n ,int m){
        if(m == 0){
            return 0;
        }
        if(m == 1){
            return n;
        }
        return n + multiply2(n, m-1);
    }

    public static void main(String gh[]){

        int n = 8;
        int m = 3;

        int res = multiply2(n,m);
        System.out.println(res);
    }
}
