import java.util.*;

public class SumDigits {
    public static int getSum(int n) {
        if (n == 0)
            return 0;
        int temp = n % 10;
        return temp + getSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int result = getSum(n);
            System.out.println(result);
        }
    }
}

// ACCEPTED