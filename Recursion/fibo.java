import java.util.Scanner;

public class fibo {
    public static int getNthFibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return getNthFibo(n-1)+getNthFibo(n-2);
    }

    

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fiboResult  = getNthFibo(n);
        System.out.println("n th fibo number "+fiboResult);
        input.close();
    }
}
