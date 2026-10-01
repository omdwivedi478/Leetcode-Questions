class Solution {
    public int longestPalindrome(String s) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int ch :s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int length = 0;
        boolean isOdd = false;
        for(int freq: map.values()){
            if(freq%2==0){
                length+=freq;
            }
            else{
                length+=freq-1;
                isOdd = true;
            }
        }
        if(isOdd){
            length++;
        }
        return length;
    }
}