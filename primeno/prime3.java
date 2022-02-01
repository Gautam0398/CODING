import java.util.ArrayList;
import java.util.Scanner;

public class prime3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int MAX_SIZE = 1000005;
        while (t-- > 0) {
            int n = input.nextInt();
            ArrayList<Integer> primes = new ArrayList<Integer>();
            int[] sieve = new int[MAX_SIZE];
            for (int i = 0; i < MAX_SIZE; i++) {
                sieve[i] = 1;
            }

            for (int i = 2; (long) i * i < MAX_SIZE; i++) {
                if (sieve[i] == 1) {
                    for (int j = i * i; j < MAX_SIZE; j += i) {
                        sieve[j] = 0;
                    }
                }
            }

            for (int i = 2; i < MAX_SIZE; i++) {
                if (sieve[i] == 1) {
                    primes.add(i);
                }
            }

            System.out.println(primes.get(n - 1));

        }
    }
}
