import java.util.Scanner;

class PrintBN {

    public static void getBinary(int[] a, int k, int n) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + "");
            }
            System.out.println();
            return;
        }
        if (a[k - 1] == 0) {
            a[k] = 0;
            getBinary(a, k + 1, n);
            a[k] = 1;
            getBinary(a, k + 1, n);
        } else {
            a[k] = 0;
            getBinary(a, k + 1, n);
        }

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            a[0] = 0;
            getBinary(a, 1, n);
            a[0] = 1;
            getBinary(a, 1, n);

        }
    }

}
// ACCEPTED