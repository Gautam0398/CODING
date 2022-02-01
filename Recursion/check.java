import java.util.Scanner;

public class check {
    public static boolean findN(int num, int[] a) {

        if (a[0] == num) {
            return true;
        }

        if (a.length == 1) {
            if (a[0] == num) {
                return true;
            } else {
                return false;
            }

        }
        int[] smallA = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            smallA[i - 1] = a[i];
        }
        boolean smallresult = findN(num, smallA);
        return smallresult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println("enter no you ant to find");
        int num = sc.nextInt();
        boolean result = findN(num, input);
        System.out.println(result);

    }

}