import java.util.Scanner;

class Pnd {
    public static void getID(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        getID(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        getID(n);
    }
}