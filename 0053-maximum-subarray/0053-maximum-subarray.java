class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0 ; 
        int ms = nums[0];
        
        for (int n : nums){
            sum+=n;
            ms = Math.max(ms,sum);
            if(sum<0){
                sum = 0;
            }
            
        }
        return ms;
    }
}