import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int sum = 0, sum2 = 0;
            int revenue_lost = 0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                sum += a[i];
                if (a[i] > k) {
                    b[i] = k;
                } else {
                    b[i] = a[i];
                }
                sum2 += b[i];
            }

            System.out.println("sum = " + sum + " " + "sum2 " + sum2);
            revenue_lost = sum - sum2;
            System.out.println(revenue_lost);

        }
    }
}
// CORRECT solution