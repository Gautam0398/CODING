import java.util.*;

class GetLast {
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter number you want to get it's last occurence");
        int x = sc.nextInt();
        int lastIndexResult = lastIndex(arr, 0, x);
        System.out.println(lastIndexResult);
    }
}