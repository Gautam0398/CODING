import java.util.*;
import java.io.*;

class Main {
    public static int Sum(int n) {
        int sum = 0;
        if (n == 1) {
            return n;
        } else {
            return n + Sum(n - 1);
        }
    }

    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = Sum(n);
        System.out.println(d);

    }
}

// ACCEPTED