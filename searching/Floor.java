import java.util.Scanner;

public class Floor {

    public static int FloorSearch(int[] arr, int low, int high, int X) {
      
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] sortedArray = new int[n];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = input.nextInt();
        }
        int element = input.nextInt();
        int elementIdx = FloorSearch(sortedArray, 0, sortedArray.length, element);
        System.out.println(elementIdx);
        input.close();
    }

}