import java.util.Scanner;

public class power {

    public static int getpowered(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * getpowered(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = getpowered(number, power);
        System.out.println(result);
    }
}
