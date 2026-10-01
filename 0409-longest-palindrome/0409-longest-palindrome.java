class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer>map = new HashMap<>();
        int sum = 0;
        boolean isOdd = false;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char key: map.keySet()){
            int freq = map.get(key);
            if(freq %2==0) sum+= freq;
            else{
                sum+=freq-1;
                isOdd = true;
            }
        }
        if(isOdd){
            sum++;
        }
        return sum;
    }
}