class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, max = 0;

        for(int c = 0; c < s.length(); c++) {
            while(set.contains(s.charAt(c))) {
                set.remove(s.charAt(l)); 
                l++;
            }

            set.add(s.charAt(c));
            max = Math.max(max, c - l + 1);
        }

        return max;
    }
}
