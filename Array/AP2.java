import java.util.Arrays;
import java.util.Scanner;

public class AP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {

            int n = input.nextInt();
            int final_count = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int[] elements = new int[1000000];
            Arrays.fill(elements, -1);
            for (int i = 0; i < n; i++) {
                int x = arr[i], count = -1, last = 0, d = 0, diff = 0, cd = 0;
                if (elements[arr[i]] == -1) {
                    for (int j = 0; j < n; j++) {
                        if (x == arr[j] && count == -1) {
                            count++;
                            d = count;
                            last = j;
                        } else if (x == arr[j] && count == 0) {
                            count++;
                            d = j - last;
                            last = j;
                        } else if (x == arr[j] && count > 0) {
                            count++;
                            diff = j - last;
                            last = j;
                        }
                    }
                    if (count == 0) {
                        cd = 0;
                        elements[x] = cd;
                    } else if (count == 1) {
                        cd = d;
                        elements[x] = cd;
                    } else if (count > 0 && diff == d) {
                        cd = d;
                        elements[x] = cd;
                    }

                }
            }
            for (int i = 0; i < 1000000; i++) {
                if (elements[i] != -1)
                    final_count++;

            }
            System.out.println(final_count);
            for (int i = 0; i < 1000000; i++) {
                if (elements[i] != -1) {
                    System.out.println(i + " " + elements[i]);
                }

            }

        }
    }
}