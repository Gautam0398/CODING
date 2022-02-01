import java.util.Scanner;
class nums{


    public static boolean countDigits(int a){
            int count=0;
            while(a!=0){
                a=a/10;
                ++count;
            }
        
        if(count%2==0) return true;
        else return false;
    }



    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        int total=0;
        boolean[] numsCheck = new boolean[n];
        for(int i=0; i<n ;i++ ){
            nums[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            numsCheck[i]=countDigits(nums[i]);
        }

        for(int i=0 ;i<n;i++)
        {
            
            if(numsCheck[i]== true ){
                total++;
            }
        }
        System.out.println(total);
        input.close();
    }
}