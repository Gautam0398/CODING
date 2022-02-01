import java.util.Scanner;
public class Mod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max=0;
        // int finalmax=0;

        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                break;
                else{
                    int s1 = a[i] - a[j];
                    int s2 = i - j;
                    int n1 = Math.abs(s1) + Math.abs(s2);
                    if(max<n1){
                        max = n1;
                    }
                }
            }
        }

        System.out.println(max);
    }
    
}