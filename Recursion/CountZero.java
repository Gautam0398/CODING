public class CountZero {
    public static int countZero(int num,int sum){
        if(num == 0){
            return sum;
        }
        if(num%10 == 0){
            // sum++;
            return countZero(num/10, ++sum);
        }else{
            return countZero(num/10, sum);
        }
    }
    
    public static void main(String args[]){
        int num = 10240000;
        // int a = num%10;
        // int b = num/10;
        int sum =0;
        int res = countZero(num,sum);
        System.out.println(res);
    }
}
