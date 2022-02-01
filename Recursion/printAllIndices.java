import java.util.Scanner;

public class printAllIndices {

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter number whose index array you want");
        int x = input.nextInt();

        int[] resultArr = allIndices(arr, x, 0, 0);
        System.out.println("Indices array for :" + x);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i] + "|");
        }

    }
}
