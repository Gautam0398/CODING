import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        int Acount = 0, Dcount = 0;
        int t = input.nextInt();

        while (t > 0) {
            int n = input.nextInt();
            String s = input.next();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    Acount++;
                } else if (s.charAt(i) == 'D') {
                    Dcount++;
                }
            }
            System.out.println("Acount : " + Acount + " Dcount :" + Dcount);

            if (Acount > Dcount) {
                System.out.println("Aditya");
            } else if (Acount < Dcount) {
                System.out.println("Danish");
            } else if (Acount == Dcount) {
                System.out.println("AdiDan");
            }
            t--;
        }

    }
}