import java.util.*;

class PrintA {

    public static void printArr(int[] a, int idx) {
        if (idx > a.length - 1)
            return;
        System.out.print(a[idx] + " ");
        printArr(a, idx + 1);

    }

    public static void printRevA(int[] a, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.print(a[idx] + " ");
        printRevA(a, idx - 1);
    }

    public static int Max_of_A(int[] a, int idx) {
        if (idx == a.length - 1)
            return a[idx];

        int misa = Max_of_A(a, idx + 1);
        if (misa > a[idx])
            return misa;
        else
            return a[idx];

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        printArr(arr, index);
        System.out.println();
        printRevA(arr, n - 1);
        System.out.println();
        int resultMax = Max_of_A(arr, 0);
        System.out.println("Max element = " + resultMax);
    }
}