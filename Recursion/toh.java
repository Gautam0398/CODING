import java.util.Scanner;
public class toh {
   
    public static void getSolTOH(int n,String t1d,String t2d, String t3d){
           if(n==0){
               return;
           }
           getSolTOH(n-1, t1d, t3d, t2d);
           System.out.println( n+ " -> ["+t1d+" --> "+t2d+" ]");
           getSolTOH(n-1, t3d, t2d, t1d);

    }
    


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String t1d = input.next();
        String t2d = input.next();
        String t3d = input.next();

        getSolTOH(n,t1d,t2d,t3d);
        input.close();
    }
}
