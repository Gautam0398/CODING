import java.util.Scanner;

public class Binarysearch {

    public static int bnSearch(int[] arr, int low, int high, int data) {
        int mid = low + ((high - 1) - low) / 2;
        if (low > high - 1) {
            return -1;
        }
        if (data == arr[mid]) {
            return mid;
        }
        if (data > arr[mid]) {
            return bnSearch(arr, mid + 1, high, data);

        } else {

            return bnSearch(arr, low, mid - 1, data);

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] sortedArray = new int[n];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = input.nextInt();
        }
        int element = input.nextInt();
        int elementIdx = bnSearch(sortedArray, 0, sortedArray.length, element);
        System.out.println(elementIdx);
        input.close();
    }

}