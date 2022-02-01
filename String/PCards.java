import java.util.Scanner;

class PCards {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int flag = 0;

        while (t-- > 0) {
            String onTable = input.next();
            onTable = onTable.toUpperCase();

            for (int i = 0; i < 5; i++) {
                String inHand = input.next();
                if ((inHand.charAt(0) == onTable.charAt(0)) || (inHand.charAt(1) == onTable.charAt(0))
                        || (inHand.charAt(0) == onTable.charAt(1)) || (inHand.charAt(1) == onTable.charAt(1))) {
                    flag = 1;

                }
            }

            if (flag == 1)
                System.out.println("YES");
            else {
                System.out.println("NO");
            }
            flag = 0;

        }

    }
}

// ACCEPTED