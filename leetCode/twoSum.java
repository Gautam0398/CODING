class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i< nums.length ; i++){
            int left = target - nums[i];
             for(int j =i+1 ; j< nums.length; j++ ){
                 if(left == nums[j]){
                   return new int[]{i, j};
                 }
             }
        }
        return null;        
    }
}