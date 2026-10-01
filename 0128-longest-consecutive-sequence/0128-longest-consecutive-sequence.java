class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele  : nums){
            set.add(ele);
        }
        int longest = 0;
        for(int ele : set){
            if(!set.contains(ele-1)){
                int start = ele; 
                int count = 1;
                while(set.contains(start +1)){
                    count++;
                    start++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}