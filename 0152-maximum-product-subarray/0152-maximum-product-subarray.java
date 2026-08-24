class Solution {
    public int maxProduct(int[] nums) {
        int maxP = nums[0];
        int minP = nums[0];
        int answer = nums[0];
        for (int i =1;i<nums.length;i++){
            int current = nums[i];
            int tempMax = Math.max(current,Math.max(current*maxP,current*minP));
            int tempMin = Math.min(current,Math.min(current*maxP,current*minP));
            maxP = tempMax;
            minP = tempMin;
            answer = Math.max(answer,maxP);
        }
        return answer;
    }
}