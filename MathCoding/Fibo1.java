class Fibo1{
    public static void main(String args[]){
        int n1 = 1;
        int n2 = 2;
        int n3 =0;
        int sum =0;
        sum = sum+2;

        for(int i=0;n3<4000000;i++){
             n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n3%2 == 0){
                sum+=n3;
            }
           
        }
        System.out.println(sum);
        
    }
}