import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {

        // write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int xCount = 0;
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.next();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("x")) {
                    xCount++;
                }
            }
            System.out.println(xCount);

        }

    }
}