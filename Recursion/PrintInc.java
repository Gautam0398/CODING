import java.util.Scanner;
public class PrintInc{
    public static void printInc(int n){
        if(n == 0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void printDec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printInc(n-1);
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int t = n;
       printInc(n);
       printDec(t);
    }
}