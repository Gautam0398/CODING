import java.util.*;

public class Factorial {

    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int a = fact(n);
            System.out.println(a);
        }
        input.close();
    }

}