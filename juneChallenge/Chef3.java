import java.util.*;

class Chef3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int CHEF_BANK = 0;
        int change = 0;
        int flag = 0;

        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            if (a[0] == 5) {
                CHEF_BANK = 5;
                for (int i = 1; i < n; i++) {
                    if (a[i] == 5) {
                        CHEF_BANK = CHEF_BANK + 5;
                    } else if (a[i] == 10) {
                        change = 5;
                        if (CHEF_BANK - change >= 0) {
                            CHEF_BANK = CHEF_BANK - change + 5;
                        } else {
                            System.out.println("NO");
                            flag = 1;
                            break;
                        }
                    } else if (a[i] == 15) {
                        change = 10;
                        if (CHEF_BANK - change >= 0) {
                            CHEF_BANK = CHEF_BANK - change + 5;
                        } else {
                            System.out.println("NO");
                            flag = 1;
                            break;
                        }

                    }
                }
            } else {
                flag = 1;
                System.out.println("NO");
            }
            if (flag == 0) {
                System.out.println("YES");
            }
            Arrays.fill(a, 0);
            CHEF_BANK = 0;
            flag = 0;
        }
    }
}

// Partially Accepted