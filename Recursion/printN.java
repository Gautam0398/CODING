import java.util.Scanner;

class PrintSumN {
    public static int printN(int n, int[] input) {
        if (n <= 0)
            return 0;
        return (input[n - 1] + printN(n - 1, input));

    }

    public static int getIndex(int[] a, int idx, int x) {
        if (idx > a.length - 1) {
            return -1;
        }
        if (a[idx] == x) {
            return idx;
        }
        return getIndex(a, idx + 1, x);

    }

    public static int lastIndex(int[] a, int idx, int x) {
        if (idx == a.length) {
            return -1;
        }
        int liisa = lastIndex(a, idx + 1, x);
        if (liisa == -1) {
            if (a[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println("enter the number you want to find in the given array ?");
        int x = sc.nextInt();

        int result = printN(num, input);
        System.out.println("sum of array = " + result);
        System.out.println();
        int result2 = getIndex(input, 0, x);
        System.out.println("index of given number found at: " + result2);
        System.out.println();
        int result3 = lastIndex(input, 0, x);
        System.out.println("last index of a given number found at: " + result3);

    }
}